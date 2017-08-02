package com.ipv.su.uedis.service;

import java.util.HashSet;
import java.util.Set;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import com.ipv.su.uedis.dao.RedisDaoImpl;
import com.ipv.su.uedis.model.KeyInfo;


@ApplicationScoped
public class UedisService {
	
	@Inject
	private RedisDaoImpl redisDao;
	
	@Null
	public String get( @NotNull String key) {
		return null;
	}
	
	@NotNull
	public Set<String> getKeys() {
		Set<String> keys = redisDao.getKeys();
		keys = keys == null ? new HashSet<String>() : keys;
		return keys;
	}
	
	@Null
	public KeyInfo getKeyInfo(@NotNull String key) {
		return null;
	}
	
}
