/**
 * 描述：
 * Copyright：Copyright （c） 2017
 * Company：南京银行
 * @author jxgu 
 * @version 1.0 2017年10月14日
 * @see history
 * 2017年10月14日
 */
package com.gujx.redis;

import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author jxgu
 *
 *         类功能描述：
 *
 */
public class RedisPoolClient {

    @Test
    public void redisPool() {
	JedisPool jedisPool = new JedisPool("192.168.254.129", 6379);
	// 通过连接池获取jedis对象
	Jedis jedis = jedisPool.getResource();
	jedis.select(0);

	jedis.set("age", "12");
	String age = jedis.get("age");
	System.out.println(age);

	jedis.close();
	jedisPool.close();
    }
}
