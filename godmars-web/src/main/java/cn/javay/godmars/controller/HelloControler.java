package cn.javay.godmars.controller;

import cn.javay.godmars.service.RibbonService;
import cn.javay.godmars.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @Autowired
    RibbonService ribbonService;

    @Autowired
    FeignService feignService;

    @RequestMapping(value = "/hi1")
    public String hi1(@RequestParam String name){
        return ribbonService.hi(name);
    }

    @RequestMapping(value = "/hi2")
    public String hi2(@RequestParam String name){
        return feignService.hi(name);
    }

}
