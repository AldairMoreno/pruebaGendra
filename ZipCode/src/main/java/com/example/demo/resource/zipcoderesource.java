package com.example.demo.resource;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.zipcoderest;

@RestController
@RequestMapping("/zip-code")
public class zipcoderesource {
    
	@Autowired
	private com.example.demo.services.zipcodeservice zipcodeservice;
	
	@GetMapping (value = "{id}")
	private ResponseEntity<Optional<zipcoderest>> getOneZipCode (@PathVariable ("id") Long id){
		return ResponseEntity.ok(zipcodeservice.findById(id));
	}
}
