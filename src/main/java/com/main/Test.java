package com.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	@GetMapping("/{name}")
	public String message(@PathVariable("name") String name) {
		return name + " Good to know you are using jenkins";
	}

}
