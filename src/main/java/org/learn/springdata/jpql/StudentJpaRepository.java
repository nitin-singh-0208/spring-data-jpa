package org.learn.springdata.jpql;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentJpaRepository extends JpaRepository<Student, Long> {

}
