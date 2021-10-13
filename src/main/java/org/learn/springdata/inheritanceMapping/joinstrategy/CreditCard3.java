package org.learn.springdata.inheritanceMapping.joinstrategy;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Data
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class CreditCard3 extends Payment3 {

	private String creditCard;
}
