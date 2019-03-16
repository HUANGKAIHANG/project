package com.msec.project.service;

import com.msec.project.entity.Commodity;
import com.msec.project.repository.CommodityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CommodityRepository commodityRepository;

    @Override
    public List<Commodity> getAllCommodity() {
        return commodityRepository.findAll();
    }

    @Override
    public Optional<Commodity> getCommodity(int id){
        return commodityRepository.findById(id);
    }
}
