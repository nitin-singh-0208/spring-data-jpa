package org.learn.springdata.jpql;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {


	/*No need to mention select keyword if we are fetching all columns*/
	@Query("from Student")
	List<Student> findAllStudents();

	/*Need to use select keyword to mention columns. Note the return type if Object[]*/
	@Query("select firstName,score from Student")
	List<Object[]> findAllStudentWithScores();

	/*Same above query but using an alias*/
	@Query("select st.firstName,st.score from Student st")
	List<Object[]> findAllStudentWithScoresUsingAlias();

	/* The value in @Param should be mapped to :parametername in query*/
	@Query("from Student where firstName=:firstName")
	List<Student> findAllStudentsByFirstName(@Param("firstName") String name);

	@Query("from Student where score>:min and score<:max")
	List<Student> findStudentsForGivenScoreRange(@Param("min") int min, @Param("max") int max);

	@Modifying
	@Transactional
	@Query("delete from Student where firstName=:firstName")
	void deleteStudentsbyFirstName(@Param("firstName") String firstName);

	/*Adding paging support*/
	@Query("from Student")
	List<Student> findStudentRecords(Pageable pageable);

	@Query(value = "select * from student", nativeQuery = true)
	List<Student> findAllStudentsWithNative();

	@Query(value = "select * from student where first_name=:fname", nativeQuery = true)
	List<Student> findAllStudentsWithFirstNameWithNative(@Param("fname") String fname,Pageable pageable);

	@Modifying
	@Query("update Student s set s.score =:value where s.score = (select avg(s1.score) from Student s1)")
	void updateExample(@Param("value") int value);
}
