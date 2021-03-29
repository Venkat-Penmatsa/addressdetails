package com.microservices.addressdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.addressdetails.service.AddressdetailsService;
import com.microservices.addressdetails.vo.Address;

@RestController
@RequestMapping("/addressDetails/v1")
public class AddressdetailsController {

	@Autowired
	private AddressdetailsService addressdetailsService;

	@GetMapping("/allCustomersAddress")
	public ResponseEntity<List<Address>> getCustomerAddress() {

		List<Address> addressList = addressdetailsService.getAddressDetails();

		return ResponseEntity.ok().body(addressList);
	}

	@GetMapping("/customerAddress/{custId}")
	public ResponseEntity<List<Address>> getCustomerAddressById(@PathVariable int custId) {

		List<Address> addressList = addressdetailsService.getCustomerAddressById(custId);

		return ResponseEntity.ok().body(addressList);
	}

}
