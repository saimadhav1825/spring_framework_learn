package org.example.springFrameWorkLearn.configurationbeanannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung implements Phone {

    @Autowired
    private Processor processor;

    @Override
    public void call() {
        System.out.println("Samsung Call");
        processor.phoneChip();
    }
}
