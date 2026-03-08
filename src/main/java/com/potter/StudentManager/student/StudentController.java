package com.potter.studentmanager.student;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
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
	@ResponseStatus(HttpStatus.CREATED)
	public void add(@Valid @RequestBody StudentDto request) {
		service.save(request);
	}

	@PutMapping("{id}")
	public ResponseEntity<StudentDto> update(
		@PathVariable(value = "id") String studentId,
		@Validated @RequestBody StudentDto request) {
		StudentDto studentDto = service.update(studentId, request);
		return ResponseEntity.ok().body(studentDto);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable(value = "id") String studentId) {
		service.delete(studentId);
	}

}
