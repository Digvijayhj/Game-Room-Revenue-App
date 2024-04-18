package com.lsu.csudh.gameroom.revenue.app.dao;

import com.lsu.csudh.gameroom.revenue.app.helper.GenerateCustomerInfo;
import com.lsu.csudh.gameroom.revenue.app.model.Customer;
import com.lsu.csudh.gameroom.revenue.app.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@Slf4j
public class CustomerDAO {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private GenerateCustomerInfo generateCustomerInfo;

    public String saveCustomerInfo(Customer customer) {


         var response = customerRepository.save(generateCustomerInfo.generateCustomerInfo(customer));

         if(Objects.nonNull(response))
             return "Information Saved Successfully!";
         else
             return "Issue while saving customer information";

    }
}
