package com.senai.bibliosenai.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.bibliosenai.dtos.request.response.CreateBookDto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/books")


public class BookController {
    
    //books
    @PostMapping
    public ResponseEntity<?> postMethodName(@RequestBody CreateBookDto createBookDto) {
        //TODO: process POST request
        
        System.out.println(createBookDto.getAuthor());
      


        return ResponseEntity.status(201).build();
    }
    

}
