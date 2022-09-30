package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Admin;
import com.example.demo.entities.Hospital;
import com.example.demo.services.AdminService;



@CrossOrigin(origins="http://localhost:3000/")
@RestController
public class AdminController {
	@Autowired
	AdminService aserv;
	
	@GetMapping("/getalladmin")
	public List<Admin> getAll()
	{
		return aserv.getAll();
	}
	@GetMapping("/getadmin")
	public Admin findByUserId(int id)
	{
		return aserv.findByUserId(id);
	}
}
