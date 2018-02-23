/**
 * ������
 * Copyright��Copyright ��c�� 2017
 * Company���Ͼ�����
 * @author jxgu 
 * @version 1.0 2017��10��14��
 * @see history
 * 2017��10��14��
 */
package com.gujx.redis;

import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author jxgu
 *
 *         �๦��������
 *
 */
public class RedisPoolClient {

    @Test
    public void redisPool() {
	JedisPool jedisPool = new JedisPool("192.168.254.129", 6379);
	// ͨ�����ӳػ�ȡjedis����
	Jedis jedis = jedisPool.getResource();
	jedis.select(0);

	jedis.set("age", "12");
	String age = jedis.get("age");
	System.out.println(age);

	jedis.close();
	jedisPool.close();
    }
}
