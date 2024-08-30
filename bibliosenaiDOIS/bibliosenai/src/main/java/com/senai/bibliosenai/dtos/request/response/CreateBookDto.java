package com.senai.bibliosenai.dtos.request.response;

import javax.print.DocFlavor.STRING;

public class CreateBookDto {
    private String title;
    private String author;
    private String gender;
    private String edition;
    private int year;
    
    // Constructor
    public CreateBookDto(String title, String author, int year, String gender, String edition) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.gender = gender;
        this.edition = edition;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

   
    public void setGender(String gender) {
        this.gender = gender;
    }

   
    public String getEdition() {
        return edition;
    }

    
    public void setEdition(String edition) {
        this.edition = edition;
    }
}
