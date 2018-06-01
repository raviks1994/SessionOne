package com.nt.config;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import com.sun.org.apache.xml.internal.security.utils.Base64;

public class BaseAuth implements ContainerRequestFilter {

	@Override
	public void filter(ContainerRequestContext ctx) throws IOException {
		String str=ctx.getHeaderString("Authorization");
		if(str!=null) {
		str=str.replaceFirst("Basic", "");
		try {
			str=new String(Base64.decode(str));
			String[] unameAndPwd=str.split(":");
			if(unameAndPwd[0].equals("ravi")) {
				return;
			}
			else {
				throw new IllegalArgumentException("uname is invalid");
			}
		} catch (Base64DecodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		else {
			throw new IllegalArgumentException("uname is mandatory");
		}
}
}
