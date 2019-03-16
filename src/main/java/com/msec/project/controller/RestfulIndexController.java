package com.msec.project.controller;

import com.msec.project.entity.Account;
import com.msec.project.entity.Commodity;
import com.msec.project.service.AccountService;
import com.msec.project.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "restful")
public class RestfulIndexController {

    @Autowired
    private CommodityService commodityService;

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/account",method = RequestMethod.GET)
    public List<Account> accounts(){
        List<Account> accounts = accountService.getAllAccount();
        return accounts;
    }

    @RequestMapping(value = "/commodity",method = RequestMethod.GET)
    public List<Commodity> commodities(){
        List<Commodity> commodities = commodityService.getAllCommodity();
        return commodities;
    }

    @RequestMapping(value = "/commodity/{id}",method = RequestMethod.GET)
    public Optional<Commodity> commodity(@PathVariable(name = "id")String id){
        Optional<Commodity> commodity = commodityService.getCommodity(Integer.parseInt(id));
        return commodity;
    }
}
