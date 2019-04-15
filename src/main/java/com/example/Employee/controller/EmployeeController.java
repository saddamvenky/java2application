package com.example.Employee.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {
	@PostMapping("process")
	public String process(@RequestBody Map<String, String> dataMap) {
		String string1 = dataMap.get("string1");
		String string2 = dataMap.get("string2");
		if (string1.equals(string2))
			return "true";
		else
			return "False";

}
}
