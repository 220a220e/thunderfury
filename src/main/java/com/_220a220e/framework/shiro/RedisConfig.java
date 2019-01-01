package com._220a220e.framework.shiro;

import org.crazycake.shiro.RedisManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Redis缓存配置类
 * @author Garrosh
 * @date 2019/1/1
 */
@Configuration
public class RedisConfig {

    @Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.port}")
    private int port;

    @Value("${spring.redis.password}")
    private String password;

    @Value("${spring.redis.timeout}")
    private int timeout;

    private RedisManager redisManager() {
        RedisManager redisManager = new RedisManager();

        return redisManager;
    }

}
