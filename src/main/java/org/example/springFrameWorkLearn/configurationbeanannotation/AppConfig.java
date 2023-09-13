package org.example.springFrameWorkLearn.configurationbeanannotation;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//@Configuration class will work like xml configuration,here we will use annotations
@Configuration
@ComponentScan(basePackages = "org.example.springFrameWorkLearn")
public class AppConfig {

    //@Bean is Replacement of xml bean tag
    //if we don't need to use @bean tag to get object ,can do with @component
    // xml we will use  <context:component-scan base-package="org.example.springFrameWorkLearn"/> same thing using @annotation @ComponentScan(basePackages = "org.example.springFrameWorkLearn")


/*    @Bean
    public Samsung getSamsung() {
        return new Samsung();
    }

    @Bean
    Processor getProcessor() {
        return new Processor();
    }*/
}
