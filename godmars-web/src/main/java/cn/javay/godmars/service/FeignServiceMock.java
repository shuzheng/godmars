package cn.javay.godmars.service;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceMock implements FeignService {

    @Override
    public String hi(String name) {
        return "sorry " + name;
    }

}
