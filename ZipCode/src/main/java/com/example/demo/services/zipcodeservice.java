package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.zipcoderest;
import com.example.demo.repository.ZipCodeRepository;

@Service
public class zipcodeservice {
	
    @Autowired
	private ZipCodeRepository zipCodeRepository;
    
    
    public Optional<zipcoderest> findById(Long Id){
    	return zipCodeRepository.findById(Id);
    }
}
