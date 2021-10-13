package org.learn.springdata.inheritanceMapping.singleTable;

import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
