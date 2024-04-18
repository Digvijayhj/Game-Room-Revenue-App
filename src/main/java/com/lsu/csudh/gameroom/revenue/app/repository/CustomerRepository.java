package com.lsu.csudh.gameroom.revenue.app.repository;

import com.lsu.csudh.gameroom.revenue.app.persistence.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
