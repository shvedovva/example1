package com.itvdn.spring.demo.configuration;

import com.itvdn.spring.demo.bean.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotesConfiguration {

//    private ApplicationContext applicationContext;
//
//    @Autowired
//    public NotesConfiguration(ApplicationContext applicationContext) {
//        this.applicationContext = applicationContext;
//        applicationContext.getApplicationName();
//        applicationContext.containsBean("morningRoutineNote");
//        applicationContext.getBean("morningRoutineNote");
//    }
//
    @Bean
    public Note morningRoutineNote() {
        return new Note("1. Wash the teeth 2. Have a breakfast");
    }
}
