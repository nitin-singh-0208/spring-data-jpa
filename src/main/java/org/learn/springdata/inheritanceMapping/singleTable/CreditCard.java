package org.learn.springdata.inheritanceMapping.singleTable;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@Entity
@DiscriminatorValue("cc")
public class CreditCard extends Payment {

	private String creditCard;
}
