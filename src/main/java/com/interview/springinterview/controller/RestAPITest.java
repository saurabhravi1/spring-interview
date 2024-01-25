package com.interview.springinterview.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interview.springinterview.bean.MyBean;
import com.interview.springinterview.readconfig.DBConfiguration;
import com.interview.springinterview.readconfig.PropertiesConfig;

@RestController
public class RestAPITest {
	
	@Autowired
	private PropertiesConfig propertiesConfig;
	
	@Autowired
	private DBConfiguration dbConfiguration;
	
	@Autowired
	private MyBean myBean;
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@GetMapping(path="/properties")
	public String getProperties() {
		System.out.println("MyBean : "+myBean);
		System.out.println("DBConfiguration : "+dbConfiguration.toString());
		System.out.println("Context path : "+applicationContext.getId());
		
		
		return propertiesConfig.toString();
	}
}
