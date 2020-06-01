package com.shasha.msksmanufacturer.web.mappers;

import com.shasha.msksmanufacturer.domain.Customer;
import com.shasha.msksmanufacturer.web.model.CustomerDto;
import org.mapstruct.Mapper;

/**
 * Created by kobis on 31 May, 2020
 */
@Mapper
public interface CustomerMapper {
    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);
}
