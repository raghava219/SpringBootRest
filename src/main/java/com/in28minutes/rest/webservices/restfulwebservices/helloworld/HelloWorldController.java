package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

//Controller
@RestController
public class HelloWorldController {

	//GET
	//URI - /hello-world
	//method - "Hello World"
	//@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
	
	//hello-world/path-variable/in28minutes
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World,%s", name));
	}
}
