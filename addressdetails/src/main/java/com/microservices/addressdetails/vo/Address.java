package com.microservices.addressdetails.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {

	public Address() {

	}

	public Address(int custId, String houseNo, String street, String city, String state, String country, String pin,
			Boolean defaultAddress, String addressType) {
		this.custId = custId;
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
		this.defaultAddress = defaultAddress;
		this.addressType = addressType;
	}

	private int custId;

	private String houseNo;

	private String street;

	private String city;

	private String state;

	private String country;

	private String pin;

	private Boolean defaultAddress;

	private String addressType;
}
