package com.zahir.XmlBasedConfig;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class Car implements Vehicle {
    @Autowired
    private Tyre tyre;
    @Override
    public void drive() {
        System.out.println("driving car");
    }
}
