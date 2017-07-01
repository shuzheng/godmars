package cn.javay.godmars.controller;

import cn.javay.godmars.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @Autowired
    FeignService feignService;

    @Value("${from}")
    String from;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return feignService.hi(name);
    }

    @RequestMapping(value = "/config")
    public String config(){
        return from + "<form action='http://localhost:50001/bus/refresh?destination=customers:**' method='post'><input type='submit'/></form>";
    }

}
