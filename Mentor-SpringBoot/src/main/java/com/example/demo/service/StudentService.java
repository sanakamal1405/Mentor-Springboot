package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;

import com.example.demo.repo.UserRepo;

@Service
public class StudentService {
	@Autowired 
	private UserRepo u;
	
	public void saveToDb(Student s)
	{
		u.save(s);
	}

}
