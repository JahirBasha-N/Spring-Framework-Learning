package com.zahir.JavaConfigFile;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Samsung implements Mobile {
    @Autowired
    @Qualifier("mediatek")
    Processor processor;
    @Override
    public String getName() {
        return "Samsung";
    }
    @Override
    public String toString() {
        return getName() + " " + getProcessor();
    }
}
