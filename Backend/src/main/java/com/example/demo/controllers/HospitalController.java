package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Hospital;
import com.example.demo.services.HospitalService;

@CrossOrigin(origins="*")
@RestController
public class HospitalController {
	
	@Autowired
	HospitalService hserv;
	
	@GetMapping("/getallhospital")
	public List<Hospital> getAll()
	{
		return hserv.getAll();
	}
	@GetMapping("/gethospital")
	public Hospital getById(@RequestParam("hospital_id") int id)
	{
		return hserv.getById(id);
	}
	@PostMapping("/savehospital")
	public Hospital save(@RequestBody Hospital h)
	{
		return hserv.save(h);
	}
	
	
	 
	 @DeleteMapping("/deletHospital/{hospital_id}")
	   public void deletHospitaByid(@PathVariable("hospital_id") int hospital_id) {
		 hserv.deletHospital(hospital_id);
	   }
	 
	 @PutMapping("/updateHospital")
	 Hospital updateHospital(@RequestParam("hospital_id") int hospital_id , @RequestBody Hospital b ){
		return hserv.updateHospital(hospital_id, b);
		 
	 }

}
