package org.learn.springdata.inheritanceMapping.singleTable;

import lombok.Data;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "paymentMode", discriminatorType = DiscriminatorType.STRING)
public abstract class Payment {

	@Id
	private int id;
	private double amount;
}
