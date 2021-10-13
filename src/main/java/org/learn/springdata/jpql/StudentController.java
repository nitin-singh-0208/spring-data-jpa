package org.learn.springdata.jpql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private StudentJpaRepository studentJpaRepository;

	@GetMapping("/deletestudent")
	public String deleteStudent() {
		return studentService.deleteStudent();
	}

	@GetMapping("/deletestudent2")
	public String deleteStudentV2() {
		Student student = studentRepository.findById(2l).get();
		studentRepository.delete(student);
		return "Deleted";
	}

	@GetMapping("/findone")
	public String findone() {
		return "Updated";
	}
}
