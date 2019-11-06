package com.freedom.foundationDb.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: HZB
 * @Description: 分页插件
 * @Date: Created in 14:49 2019/10/8
 */
@Configuration
@MapperScan("com.freedom.foundationDb.dao.mapper")
public class MybatisPlusConfig {

    /**
     * 分页插件
     * 
     * @return PaginationInterceptor paginationInterceptor
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}