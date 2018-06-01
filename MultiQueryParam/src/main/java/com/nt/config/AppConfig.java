package com.nt.config;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.nt.service.PaytmService;

@ApplicationPath("/rest/*")
public class AppConfig extends Application {

	@Override
	public Map<String, Object> getProperties() {
		Map<String, Object> map = new HashMap<>();
		map.put("jersey.server.config.provider.packages", "com.nt.service");
		return map;
	}

	@Override
	public Set<Object> getSingletons() {
		Set<Object> set = new HashSet<>();
		set.add(new PaytmService());
		return set;
	}

/*	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> set = new HashSet<>();
		set.add(BaseAuth.class);
		return set;
	}*/
}
