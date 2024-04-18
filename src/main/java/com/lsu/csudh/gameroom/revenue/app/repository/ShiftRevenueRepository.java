package com.lsu.csudh.gameroom.revenue.app.repository;

import com.lsu.csudh.gameroom.revenue.app.persistence.ShiftRevenue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShiftRevenueRepository extends JpaRepository<ShiftRevenue, Long> {
}
