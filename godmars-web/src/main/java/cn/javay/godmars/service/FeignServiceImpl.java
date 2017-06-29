package cn.javay.godmars.service;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceImpl implements FeignService {

    @Override
    public String hi(String name) {
        return "sorry " + name;
    }

}
