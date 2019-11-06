package com.freedom.foundationClient.dao.constant;

import lombok.Data;

@Data
public class UserInfo {

    /**
     * id
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 姓名
     */
    private String name;

    /**
     * 头像图片
     */
    private String imageUrl;

    /**
     * 用户手机号码
     */
    private String mobile;

}
