package com.freedom.freedomCore.config.syslog;

import java.lang.annotation.*;

/**
 * @Author: HZB
 * @Description:
 * @Date: Created in 14:26 2019/9/30
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface SysLogPoint {

    /**
     * 操作名
     */
    String actionName() default "unknown";

    /**
     * 方法名
     */
    String interfaceUrl() default "unknown";

    /**
     * 是否忽略结果
     */
    boolean ignoreOutput() default false;

    /**
     * 需要脱敏的参数，如password
     */
    String[] sensitiveParams() default {"password", "UserInfo"};

    /**
     * 目标类型：CONTROLLER：controller日志, SERVICE：service日志, DAO：dao日志, METHOD：普通方法日志
     */
    SysLogTarget target() default SysLogTarget.CONTROLLER;

}
