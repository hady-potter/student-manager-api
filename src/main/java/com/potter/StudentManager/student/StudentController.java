package com.potter.studentmanager.student;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/students")
@AllArgsConstructor
public class StudentController {

	private final StudentService service;

	@GetMapping
	public List<StudentDto> getAll() {
		return service.getAll();
	}

	@GetMapping("{id}")
	public ResponseEntity<StudentDto> findById(@PathVariable String id) {
		StudentDto foundStudent = service.findById(id);
		return new ResponseEntity<>(foundStudent, HttpStatus.OK);
	}

	@PostMapping
	public void add(@RequestBody StudentDto request) {
		service.save(request);
	}

	@PutMapping("/update/{id}")
	public void update(
		@PathVariable(value = "id") String studentId,
		@RequestBody StudentDto request) {
		service.update(studentId, request);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable(value = "id") String studentId) {
		service.delete(studentId);
	}

}
