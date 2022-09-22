package com.itvdn.spring.demo.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Note {

    private String textNote;

    public Note() {
    }

    public Note(String text) {
        this.textNote = text;
    }

    public String getTextNote() {
        return textNote;
    }

    public void setTextNote(String textNote) {
        this.textNote = textNote;
    }

    @Override
    public String toString() {
        return "Note{" +
                "text='" + textNote + '\'' +
                '}';
    }
}
