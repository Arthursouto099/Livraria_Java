/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class Book {
    private String title;
    private String code;
    public String author;
    
    
    
    public Book(String title, String code, String author) {
        this.title = title;
        this.code = code;
        this.author = author;
    }
    

    
    public String getTitle() {
        return this.title;
    }
    
    public String getCode() {
        return this.code;
    }
    
}
