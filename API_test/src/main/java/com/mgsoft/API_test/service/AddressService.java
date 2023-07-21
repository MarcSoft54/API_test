package com.mgsoft.API_test.service;

import com.mgsoft.API_test.model.Address;
import com.mgsoft.API_test.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressService {


    private AddressRepository addressRepository;

    public Iterable<Address> getAddress(){
        return addressRepository.findAll();
    }

    public Address createAddress(Address a){
        return addressRepository.save(a);
    }
}
