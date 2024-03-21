package com.zahir.XmlBasedConfig;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class Tyre {
    String brand;

    @Override
    public String toString() {
        return "Tyre Punctured";
    }
}
