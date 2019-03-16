package com.msec.project.service;

import com.msec.project.entity.Commodity;

import java.util.List;
import java.util.Optional;

public interface CommodityService {
    List<Commodity> getAllCommodity();

    Optional<Commodity> getCommodity(int id);
}
