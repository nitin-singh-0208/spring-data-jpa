package org.learn.springdata.inheritanceMapping.tablePerClass;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Cheque2 extends Payment2 {

	private String chequeNumber;
}
