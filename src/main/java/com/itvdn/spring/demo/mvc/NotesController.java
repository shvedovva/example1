package com.itvdn.spring.demo.mvc;

import com.itvdn.spring.demo.bean.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notes")
public class NotesController {

    @Autowired
    private Note morningNote;

    @GetMapping(value = "/morningNote")
    public Note getMorningNote() {
        return morningNote;
    }

    // MIME type
    @GetMapping(value = "/eveningNote", produces = "application/json")
    public Note getEveningNote() {
        return new Note("1. Brush my teeth 2. Surf social media. 3. Fall asleep");
    }
}
