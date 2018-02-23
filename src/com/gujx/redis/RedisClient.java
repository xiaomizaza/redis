package com.gujx.redis;
import org.junit.Test;

import redis.clients.jedis.Jedis;

/**
 * ������
 * Copyright��Copyright ��c�� 2017
 * Company���Ͼ�����
 * @author jxgu 
 * @version 1.0 2017��10��14��
 * @see history
 * 2017��10��14��
 */

/**
 * @author jxgu
 *
 *         �๦��������
 *
 */
public class RedisClient {

    @Test
    public void jedisClient() {
	// ��ʵ������
	Jedis jedis = new Jedis("192.168.254.129", 6379);
	jedis.select(0);

	jedis.set("sex", "male");

	String sex = jedis.get("sex");
	System.out.println(sex);

	String name = jedis.get("name");
	System.out.println(name);

	jedis.close();
    }
}
