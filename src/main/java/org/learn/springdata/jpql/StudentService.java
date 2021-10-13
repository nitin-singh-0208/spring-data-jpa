package org.learn.springdata.jpql;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class StudentService {

	private final StudentRepository studentRepository;

	@Transactional
	public String deleteStudent() {
		studentRepository.deleteStudentsbyFirstName("A1");
		return "Deleted";
	}

	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
}
