package org.dnyanyog.controller;

import java.sql.SQLException;
import java.util.List;

import org.dnyanyog.services.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@GetMapping("/firstName/{rollNumber}")
	public String getFirstName(@PathVariable String rollNumber) {
		return new StudentService().getFirstName(rollNumber);
	}
	
	@GetMapping("/lastName/{rollNumber}")
	public String getLastName(@PathVariable String rollNumber) {
		return new StudentService().getLastName(rollNumber);
	}
	
	@GetMapping("/mobile/{rollNumber}")
	public String getMobile(@PathVariable String rollNumber) {
		return new StudentService().getMobile(rollNumber);
	}
	
	@GetMapping("/email/{rollNumber}")
	public String getEmail(@PathVariable String rollNumber) {
		return new StudentService().getEmail(rollNumber);
	}
	
	@GetMapping("/getStudent/{firstName}")
	public List<String> getStudent(@PathVariable String firstName) throws SQLException{
		return new StudentService().getStudentName(firstName);
	}
}
