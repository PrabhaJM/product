package com.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class Productservice {
	
	@GetMapping(path ="/getProduct")
	public ResponseEntity<List<String>> getProduct() {
		
		List<String> product = new ArrayList<String>();
		product.add("Nokia");
		product.add("Sony");
		product.add("Iphone");
		
		
		return new ResponseEntity<>(product,HttpStatus.OK);
		
		
	}

}