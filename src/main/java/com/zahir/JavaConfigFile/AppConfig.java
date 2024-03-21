package com.zahir.JavaConfigFile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.zahir.JavaConfigFile")
public class AppConfig {
    // @Bean is a replacement annotation for the .xml annotation which has the id and class path etc replacing this ComponentScan
    // we can use the
//    @Bean
//    public Samsung getSamsung() {
//        return new Samsung();
//    }
//    @Bean
//    public Processor getProcessor() {
//        return new Snapdragon();
//    }
//    @Bean
//    public Processor getMediaTek() {
//        return new MediaTek();
//    }
}
