package com.mgsoft.API_test.controller;

import com.mgsoft.API_test.model.Address;
import com.mgsoft.API_test.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
@RequiredArgsConstructor
public class AddressController {

    private AddressService addressService;

    @GetMapping("/getaddress")
    public Iterable<Address> getAddress(){
        return addressService.getAddress();
    }

    @PostMapping("createaddress")
    public Address createAddress(Address a){
        return addressService.createAddress(a);
    }
}
