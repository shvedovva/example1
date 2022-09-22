package com.itvdn.spring.demo.bean;

import org.springframework.stereotype.Component;

@Component
public class EveningNote {

    private String text = "1. Wash my teeth 2. Browse social media 3. Fall asleep";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
