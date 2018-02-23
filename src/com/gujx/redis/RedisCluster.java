/**
 * ������
 * Copyright��Copyright ��c�� 2017
 * Company���Ͼ�����
 * @author jxgu 
 * @version 1.0 2017��10��28��
 * @see history
 * 2017��10��28��
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
 *         �๦��������
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
