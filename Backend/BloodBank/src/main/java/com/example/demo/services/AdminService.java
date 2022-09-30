package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Admin;
import com.example.demo.repositories.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	AdminRepository adminrepo;

	public List<Admin> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Admin findByUserId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
