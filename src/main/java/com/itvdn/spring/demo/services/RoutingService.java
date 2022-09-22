package com.itvdn.spring.demo.services;

import com.itvdn.spring.demo.bean.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoutingService {

    @Autowired
    private Note morningRoutineNote;

    @Autowired
    public RoutingService(Note morningRoutineNote) {
    }

    @Autowired
    public void setMorningRoutineNote(Note morningRoutineNote) {
        this.morningRoutineNote = morningRoutineNote;
    }
}
