package com.ipv.su.uedis.dao;

import java.util.Set;

import redis.clients.jedis.Tuple;

public interface RedisDao {
	public Set<String> getKeys();
	public Set<Tuple> getValue(String pattern, String type);
	public String getType(String key);
	
	public boolean deleteAll();
	public boolean deleteKey(String key);
	public boolean deleteByPattern(String pattern);
}
