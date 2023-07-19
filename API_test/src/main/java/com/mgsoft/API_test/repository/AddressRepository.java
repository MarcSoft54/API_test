package com.mgsoft.API_test.repository;

import com.mgsoft.API_test.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
