package com.microservices.addressdetails.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.addressdetails.Entity.AddressdetailsEntity;
import com.microservices.addressdetails.Repository.AddressdetailsRepository;
import com.microservices.addressdetails.vo.Address;

@Service
public class AddressdetailsService {

	@Autowired
	private AddressdetailsRepository addressDetailsRepository;

	public List<Address> getAddressDetails() {

		List<Address> addressList = new ArrayList<Address>();

		List<AddressdetailsEntity> addressdetailsEntity = addressDetailsRepository.findAll();

		if (!addressdetailsEntity.isEmpty()) {

			addressList = addressdetailsEntity.stream()
					.map(addressEntity -> new Address(addressEntity.getId(), addressEntity.getHouseNo(),
							addressEntity.getStreet(), addressEntity.getCity(), addressEntity.getState(),
							addressEntity.getCountry(), addressEntity.getPin(), addressEntity.getDefaultAddress(),
							addressEntity.getAddressType()))
					.collect(Collectors.toList());
		}

		return addressList;
	}

	public List<Address> getCustomerAddressById(int id) {

		List<Address> addressList = new ArrayList<Address>();

		List<AddressdetailsEntity> addressdetailsEntity = addressDetailsRepository.findAddressByCustId(id);

		if (!addressdetailsEntity.isEmpty()) {

			addressList = addressdetailsEntity.stream()
					.map(addressEntity -> new Address(addressEntity.getCustId(), addressEntity.getHouseNo(),
							addressEntity.getStreet(), addressEntity.getCity(), addressEntity.getState(),
							addressEntity.getCountry(), addressEntity.getPin(), addressEntity.getDefaultAddress(),
							addressEntity.getAddressType()))
					.collect(Collectors.toList());
		}

		return addressList;
	}

}
