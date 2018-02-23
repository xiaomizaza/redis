/**
 * 描述：
 * Copyright：Copyright （c） 2017
 * Company：南京银行
 * @author jxgu 
 * @version 1.0 2017年10月28日
 * @see history
 * 2017年10月28日
 */
package com.gujx.redis;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

/**
 * @author jxgu
 *
 *         类功能描述：
 *
 */
public class RedisCluster {

    @Test
    public void redisCluster() {
	Set<HostAndPort> nodes = new HashSet<HostAndPort>();
	nodes.add(new HostAndPort("192.168.254.129", 7001));
	nodes.add(new HostAndPort("192.168.254.129", 7002));
	nodes.add(new HostAndPort("192.168.254.129", 7003));
	nodes.add(new HostAndPort("192.168.254.129", 7004));
	nodes.add(new HostAndPort("192.168.254.129", 7005));
	nodes.add(new HostAndPort("192.168.254.129", 7006));
	nodes.add(new HostAndPort("192.168.254.129", 7007));

	JedisCluster cluster = new JedisCluster(nodes);
	cluster.set("name", "wangdi");

	String result = cluster.get("name");
	System.out.println(result);
    }

}
