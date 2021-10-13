package org.learn.springdata.inheritanceMapping.tablePerClass;

import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository2 extends CrudRepository<Payment2, Integer> {

}
