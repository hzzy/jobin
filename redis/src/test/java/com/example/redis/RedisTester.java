package com.example.redis;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

@SpringBootTest(classes = RedisApplication.class)
public class RedisTester {

    @Resource
    private RedisTemplate redisTemplate;


    @Test
    public void test() {
        redisTemplate.opsForValue().set("key", "test");
        Object key = redisTemplate.opsForValue().get("key");
        System.out.println(key);
    }

}
