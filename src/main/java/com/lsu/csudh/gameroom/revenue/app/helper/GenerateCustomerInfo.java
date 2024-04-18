package com.lsu.csudh.gameroom.revenue.app.helper;

import com.lsu.csudh.gameroom.revenue.app.persistence.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class GenerateCustomerInfo {

    public Customer generateCustomerInfo(com.lsu.csudh.gameroom.revenue.app.model.Customer customer) {

        var customerResponse = new Customer();
        customerResponse.setName(customer.getName());
        customerResponse.setStudentId(customer.getStudentId());
        customerResponse.setTime(customer.getTime());
        customerResponse.setAmount(customer.getAmount());
        customerResponse.setType(customer.getType());

        log.debug("Generate Customer Response : {}", customerResponse);

        return customerResponse;



    }
}
