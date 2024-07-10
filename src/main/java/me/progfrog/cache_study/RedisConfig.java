package me.progfrog.cache_study;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;

@Configuration
public class RedisConfig {

    @Bean
    public JedisPool createJedisPool() {
        return new JedisPool("127.0.0.1", 6379);
    }
}
