package com.example.nisum.SpringBootDemo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/products")
public class ProductController {
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> getAllProducts()
	{
		return new ResponseEntity<>("All the product's",HttpStatus.OK);
	}

}
