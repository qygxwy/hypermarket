package com.kuo.hypermarket.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangfangfang
 * @Title: MyBatisConfig
 * @Description: mybatis配置类
 * @date 2020/4/251:53 下午
 * @since 1.8
 */
@Configuration
@MapperScan("com.kuo.hypermarket.mbg.mapper")
public class MyBatisConfig {
}