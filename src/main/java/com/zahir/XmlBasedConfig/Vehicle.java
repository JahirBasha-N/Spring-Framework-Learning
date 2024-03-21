package com.zahir.XmlBasedConfig;

public interface Vehicle {
    void drive();
    default Tyre getTyre() {
        return null;
    }
}
