package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Hospital;
import com.example.demo.repositories.HospitalRepository;

@Service
public class HospitalService {
	
	@Autowired
	HospitalRepository hosrepo;
	
	public List<Hospital> getAll()
	{
		return hosrepo.findAll();
	}
	public Hospital getById(int id)
	{
		return hosrepo.findById(id).get();
	}
	public Hospital save(Hospital h)
	{
		return hosrepo.save(h);
	}
	
	public void deletHospital(int hid) {
		hosrepo.deleteById(hid);
	   }
	
	public Hospital updateHospital(int id,Hospital b)
	{
		Hospital hospital =null;
		try {
			 hospital =hosrepo.findById(id).get();
			   
			   if( hospital==null)
			   {
				   System.out.println("user not found");
			   }
			   else
			   {
				   if(b.getHospital_name()!=null)
					   hospital.setHospital_name(b.getHospital_name());
				   if(b.getLicence_no()!=null)
					   hospital.setLicence_no(b.getLicence_no());
				  if(b.getAddress()!=null)
					  hospital.setAddress(b.getAddress());
				  if(b.getCity()!=null)
					  hospital.setCity(b.getCity());
				  if(b.getContact_number()!=null)
					  hospital.setContact_number(b.getContact_number());
				  if(b.getEmail()!=null)
					  hospital.setEmail(b.getEmail());
				  if(b.getWebsite()!=null)
					  hospital.setWebsite(b.getWebsite());
			   }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		hosrepo.save( hospital);
		return  hospital;
	}
	

}
