package com.test.MicroContinuo.Controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.MicroContinuo.Services.IUsersServices;

@RestController
@RequestMapping("/docker")
public class Controllers {
	@Autowired
	private IUsersServices userService;
	@GetMapping(value="/probando")
	public String probandoMicro(){
		return "Probando micro";
	}
	@GetMapping(value="/createUser")
	public String createUser(@RequestParam String username, @RequestParam String password){
		return userService.createUser(username, password);
	}
	
	@GetMapping(value="/listUser")
	public String listUsers(){
		return userService.listUsers();
	}

}
