package com.itvdn.spring.demo.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("singleton") //prototype, singleton, session, request
public class NoteWithScope {
    private String text;

    public NoteWithScope(String text) {
        this.text = text;
    }
}
