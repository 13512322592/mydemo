package com.yxd.mydemo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yxd.mydemo.po.EmpPo;
import com.yxd.mydemo.service.MyService;

@Controller
@RequestMapping("/")
public class MyController {
	
	@Autowired
	MyService myService;
	
	@RequestMapping("/login")
	String toLogin() {
		System.out.println("login");
		return "login.html";
	}
	@RequestMapping("/user")
	String toUser() {
		System.out.println("user");
		return "user/user.html";
	}
	
	@RequestMapping("/getUser")
	@ResponseBody
	public Map getUser(String id) {
		EmpPo emp = myService.getEmpById(id);
		Map<String,Object> map = new HashMap<>();
		map.put("emp", emp);
		return map;
	}
}
