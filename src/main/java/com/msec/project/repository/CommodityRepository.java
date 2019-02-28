package com.msec.project.repository;

import com.msec.project.entity.Commodity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommodityRepository extends JpaRepository<Commodity, Integer> {
}
