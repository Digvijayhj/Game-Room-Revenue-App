package com.lsu.csudh.gameroom.revenue.app.controller;

import com.lsu.csudh.gameroom.revenue.app.dao.CustomerDAO;
import com.lsu.csudh.gameroom.revenue.app.model.Customer;
import com.lsu.csudh.gameroom.revenue.app.persistence.ShiftRevenue;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class RevenueController {

    @Autowired
    private CustomerDAO customerDAO;

    @PostMapping("/customerInfo")
    public String customerInfo(@NonNull @RequestBody Customer customer) {
        return customerDAO.saveCustomerInfo(customer);
    }

    @GetMapping("/get/shiftReport")
    public ShiftRevenue getShiftRevenue() {
        return null;
    }


}
