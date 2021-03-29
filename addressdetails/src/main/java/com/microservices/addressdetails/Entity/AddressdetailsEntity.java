package com.microservices.addressdetails.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "AddressDetails")
@Getter
@Setter
public class AddressdetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "custId")
	private int custId;

	@Column(name = "houseNo")
	private String houseNo;

	@Column(name = "street")
	private String street;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "country")
	private String country;

	@Column(name = "pin")
	private String pin;

	@Column(name = "defaultAddress")
	private Boolean defaultAddress;

	@Column(name = "addressType")
	private String addressType;

}
