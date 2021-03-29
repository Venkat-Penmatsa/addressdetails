package com.microservices.addressdetails.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.microservices.addressdetails.Entity.AddressdetailsEntity;

@Repository
public interface AddressdetailsRepository extends JpaRepository<AddressdetailsEntity, Integer> {

	@Query(value = "select * from Address_Details where cust_id =?1 ", nativeQuery = true)
	public List<AddressdetailsEntity> findAddressByCustId(int custId);
	

}
