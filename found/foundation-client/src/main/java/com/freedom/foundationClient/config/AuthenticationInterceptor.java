package com.freedom.foundationClient.config;


import com.auth0.jwt.JWT;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.freedom.freedomCore.annotation.LoginRequired;
import com.freedom.freedomCore.exception.CustomException;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

public class AuthenticationInterceptor implements HandlerInterceptor {

    /**
     * 用户Service
     */
//    @Autowired
//    private AdminUserService adminUserService;

    /**
     * 验证token
     * @param request HttpServletRequest
     * @param response HttpServletResponse
     * @param handler handler
     * @return boolean
     */
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) {
        // 如果不是映射到方法直接通过
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }

        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();

        // 判断接口是否需要登录
        LoginRequired methodAnnotation = method.getAnnotation(LoginRequired.class);

        // 有 @LoginRequired 注解，需要认证
        if (methodAnnotation != null) {
            // 执行认证
            String token = request.getHeader("token");  // 从 http 请求头中取出 token
            if (token == null) {

                throw new CustomException("400", "无token，请重新登录");
            }
            int userId;
            try {

                userId = Integer.parseInt(JWT.decode(token).getAudience().get(0));  // 获取 token 中的 user id
            } catch (JWTDecodeException e) {

                throw new CustomException("400", "token无效，请重新登录");
            }

//            TEhAdminUser user = adminUserService.selectById(userId);
//            if (user == null) {
//
//                throw new CustomException("400", "用户不存在，请重新登录");
//            }
//
//            if (!user.getEnabled() || user.getDeleted()) {
//
//                throw new CustomException("401", "当前用户无效！");
//            }
//
//            // 验证 token
//            try {
//                JWTVerifier verifier = JWT.require(Algorithm.HMAC256(user.getPassword())).build();
//                try {
//
//                    verifier.verify(token);
//                } catch (JWTVerificationException e) {
//
//                    throw new CustomException("400", "token无效，请重新登录");
//                }
//            } catch (UnsupportedEncodingException ignore) {
//            }
//
//            UserInfo userInfo = new UserInfo();
//            BeanUtils.copyProperties(user, userInfo);
//            request.setAttribute("currentUser", userInfo);

            return true;
        }
        return true;
    }

}
