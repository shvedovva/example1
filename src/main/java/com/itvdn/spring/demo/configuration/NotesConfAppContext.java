package com.itvdn.spring.demo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotesConfAppContext {

    private ApplicationContext applicationContext;

    @Autowired
    public NotesConfAppContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
        applicationContext.getApplicationName();
        applicationContext.containsBean("morningRoutineNote");
        applicationContext.getBean("morningRoutineNote");
    }

}
