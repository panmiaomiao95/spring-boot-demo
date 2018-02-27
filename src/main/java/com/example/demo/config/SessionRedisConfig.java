package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by Admin on 2018/2/23.
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 30)
public class SessionRedisConfig {
}
