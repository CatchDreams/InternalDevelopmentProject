package com.example.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
@RequestMapping(value="/calculator")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("This is the scam");
	}
	
	@RequestMapping(path="/add/{a}/{b}",produces = "application/json",method=RequestMethod.GET)
	public int sum(@PathVariable int a,@PathVariable int b){
		return a+b;
	}
    
	@RequestMapping(path="/add/{a}/{b}",produces = "application/json",method=RequestMethod.GET)
	public int sub(@PathVariable int a,@PathVariable int b){
		return a-b;
	}
}
