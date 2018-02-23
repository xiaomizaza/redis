package com.gujx.redis;
import org.junit.Test;

import redis.clients.jedis.Jedis;

/**
 * 描述：
 * Copyright：Copyright （c） 2017
 * Company：南京银行
 * @author jxgu 
 * @version 1.0 2017年10月14日
 * @see history
 * 2017年10月14日
 */

/**
 * @author jxgu
 *
 *         类功能描述：
 *
 */
public class RedisClient {

    @Test
    public void jedisClient() {
	// 单实例连接
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
