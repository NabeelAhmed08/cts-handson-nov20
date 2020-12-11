package com.app.testing;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	public String defaultMessge() {
		return "Welcome user";
	}

}