package com.mru.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mru.entity.Mobiles;
import com.mru.entity.Students;
import com.mru.repo.MruRepo;

@Service
public class MruService {
	@Autowired
	
	private MruRepo repo;
	public List<Students> getAllStudents(){
		return repo.findAll();
		
	}
	
	
}
