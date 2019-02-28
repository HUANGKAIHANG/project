package com.msec.project.controller;

import com.msec.project.entity.Account;
import com.msec.project.entity.Commodity;
import com.msec.project.service.AccountService;
import com.msec.project.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private CommodityService commodityService;

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(Model model){
        List<Commodity> commodities = commodityService.getAllCommodity();
        List<Account> accounts = accountService.getAllAccount();
        model.addAttribute("welcomeMsg","COMP5322 PROJECT~");
        model.addAttribute("commodities",commodities);
        model.addAttribute("accounts",accounts);
        return "index";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String toLogin(){
        return "login";
    }
}
