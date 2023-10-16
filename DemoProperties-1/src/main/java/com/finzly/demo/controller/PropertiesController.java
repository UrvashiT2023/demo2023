package com.finzly.demo.controller;

import java.io.IOException; 

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.finzly.demo.entity.PropertiesManager;
import com.finzly.demo.service.PropertiesService;

@RestController
public class PropertiesController {

	@Autowired
	PropertiesService propertiesService;
int i =90;
	
	@RequestMapping(method = RequestMethod.GET,value = "/getall")
	public String getProperties() throws IOException {
		String filename = "application.properties";
		
		return propertiesService.getProperties(filename);
	}

}
