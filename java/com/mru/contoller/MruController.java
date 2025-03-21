package com.mru.contoller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.mru.Service.MruService;
import com.mru.entity.Mobiles;
import com.mru.entity.Students;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@CrossOrigin("*")
public class MruController {

	@Autowired
	private MruService service;
	
		@GetMapping("/Students")	
		
	public List<Students> getAllStudents(){
		return service.getAllStudents();
	}
	
	
	
	
}
