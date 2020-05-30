package com.shasha.msksmanufacturer.services;

import com.shasha.msksmanufacturer.web.model.CustomerDto;

import java.util.UUID;

/**
 * Created by kobis on 28 May, 2020
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteById(UUID customerId);
}
