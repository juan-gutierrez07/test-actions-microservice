package com.test.MicroContinuo.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;


public interface IUsersServices {
	
	public abstract String createUser(@RequestParam String username, @RequestParam String password);
	public abstract String listUsers();

}
