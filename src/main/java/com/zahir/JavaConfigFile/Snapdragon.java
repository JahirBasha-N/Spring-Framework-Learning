package com.zahir.JavaConfigFile;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements Processor{
    @Override
    public String getProcessor() {
        return "Snapdragon";
    }

    @Override
    public String toString() {
        return getProcessor();
    }
}
