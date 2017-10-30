package com.example.nisum.SpringBootDemo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/products")
public class ProductController {
	
	@RequestMapping(method=RequestMethod.PUT)
	public ResponseEntity<?> getAllProducts()
	{
		return new ResponseEntity<>("All the product's",HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/getProduct")
	public ResponseEntity<?> getAllProduct()
	{
		return new ResponseEntity<>("one product",HttpStatus.OK);
	}
	
	public ResponseEntity<?> saveProduct()
	{
		return new ResponseEntity<>("save Product",HttpStatus.OK);
	}
	
	public ResponseEntity<?> updateProduct()
	{
		return new ResponseEntity<>("save Product",HttpStatus.OK);
	}
	public ResponseEntity<?> delete()
	{
		return new ResponseEntity<>("save Product",HttpStatus.OK);
	}
}
