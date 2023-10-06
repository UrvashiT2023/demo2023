package com.Demo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Demo.demo.services.EmployeeServices;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeServices empService;

	@RequestMapping("getName")
	public String getName() {
		return empService.getName();
	}
}
