package com.test.MicroContinuo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.test.MicroContinuo.Models.User;
import com.test.MicroContinuo.Repositorys.IUsersRepositoryJPA;

@Service
public class UsersServices implements IUsersServices {
	@Autowired
	private IUsersRepositoryJPA userRepo;
	String JSON = null, json1 = null, json2= null;	
	@Override
	public String createUser(String username, String password) {
		try {
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			userRepo.save(user);
			json1 = new Gson().toJson("200");
		} catch (Exception e) {
			e.printStackTrace();
			json1 = new Gson().toJson("500");
		}
		 return JSON= "["+ json1+"]";
	}
	
	@Override
	public String listUsers() {
		try {
			json1 = new Gson().toJson("200");
			json2 = new Gson().toJson(userRepo.findAll());
		} catch (Exception e) {
			json1 = new Gson().toJson("200");
			json2 = new Gson().toJson(null);
		}
		return JSON= "["+json1+","+json2+"]";
	}
	
}
