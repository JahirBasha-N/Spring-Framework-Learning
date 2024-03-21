package com.zahir.JavaConfigFile;

import org.springframework.stereotype.Component;

@Component("mediatek")
public class MediaTek implements Processor {
    @Override
    public String getProcessor() {
        return "MediaTek";
    }

    @Override
    public String toString() {
        return getProcessor();
    }
}
