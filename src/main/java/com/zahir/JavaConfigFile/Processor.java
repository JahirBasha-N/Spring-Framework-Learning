package com.zahir.JavaConfigFile;

public interface Processor {
    String processor = "No Processor";
    default String getProcessor() {
        return processor;
    };
}
