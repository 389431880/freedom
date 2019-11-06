package com.freedom.freedomCore.utils.weixin;

import com.alibaba.fastjson.JSONObject;
import com.freedom.freedomCore.utils.HttpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * 微信全局票据
 */
@Component
@Slf4j
public class WeiXinJSSDKUtils {

    /**
     * 微信公众号appid
     */
    @Value("${weixin.subscription.app_id}")
    private String wxAppId;

    /**
     * 微信公众号appsecret
     */
    @Value("${weixin.subscription.app_secret}")
    private String wxAppSecret;

    /**
     * 学员端appid
     */
    @Value("${weixin.student.app_id}")
    private String studentAppId;

    /**
     * 学员端appsecret
     */
    @Value("${weixin.student.app_secret}")
    private String studentAppSecret;

    /**
     * 微信全局票据 ---->>>> access_token
     * @return accessToken
     */
    @Cacheable(value = "getSubscriptionAccessToken", sync = true)
    public String getSubscriptionAccessToken() {

        try {
            return getAccessToken(wxAppId, wxAppSecret);
        } catch (Exception e) {
            log.error("Get base access_token from redis is error.");
        }

        return null;
    }

    /**
     * 微信全局票据 ---->>>> access_token
     * @return accessToken
     */
    @Cacheable(value = "getStudentAccessToken", sync = true)
    public String getStudentAccessToken() {

        try {
            return getAccessToken(studentAppId, studentAppSecret);
        } catch (Exception e) {
            log.error("Get base access_token from redis is error.");
        }

        return null;
    }

    /**
    * @description: 获取accesstoken
    * @param appid appid
    * @param secret secret
    * @return java.lang.String
    * @throws
    * @date 2019/9/10 9:51 
    */
    private String getAccessToken(String appid, String secret) {
        String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="
                + appid + "&secret=" + secret;
        String rs = HttpUtil.sendGet(url);

        JSONObject objContent = JSONObject.parseObject(rs);
        log.info(objContent.toJSONString());
        String accessToken = objContent.getString("access_token");
        Integer time = Integer.parseInt(objContent.getString("expires_in"));

        log.info("Set base access_token to redis is successful.parameters time:{},realtime", time, time - 3600);
        return accessToken;
    }

    /**
     * jsapi_ticket是公众号用于调用微信JS接口的临时票据
     * @return jsapi_ticket
     */
    @Cacheable(value = "getJsapiTicket", sync = true)
    public String getJsapiTicket() {

        try {
            //缓存中没有、或已经失效
            //获取全局的access_token，唯一票据
            String accessToken = getSubscriptionAccessToken();

            String url = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=" + accessToken + "&type=jsapi";

            String rs = HttpUtil.sendGet(url);

            JSONObject objContent = JSONObject.parseObject(rs);
            String jsapiTicket = objContent.getString("ticket");
            log.info(objContent.toJSONString());
            return jsapiTicket;
        } catch (Exception e) {

            log.error("Get js_api_ticket from redis is error:{}", e);
        }

        return null;
    }

}
