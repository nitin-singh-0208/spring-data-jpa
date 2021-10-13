package org.learn.springdata.inheritanceMapping.singleTable;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@Entity
@DiscriminatorValue("cq")
public class Cheque extends Payment {

	private String chequeNumber;
}
