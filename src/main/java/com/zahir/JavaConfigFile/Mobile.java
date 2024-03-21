package com.zahir.JavaConfigFile;

public interface Mobile {
    String name = "No Name";
    default String getName() {
        return name;
    };
}
