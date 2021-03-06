package org.learn.springdata.componentMapping;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class Address {

	private String house;
	private String street;
	private String city;
	private String landmark;
	private String country;
}
