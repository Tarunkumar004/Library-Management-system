/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagement;

/**
 *
 * @author Malhotra Computer
 */public class BookModel {
     private int id;
    private String name;
    private String publisher;
    private int price;
    private String publishyear;

    
      public BookModel(int id, String name,String publisher,int price,String publishyear){
          this.id = id;
        this .name =  name;
          this .publisher =  publisher;
            this .price =  price;
              this .publishyear = publishyear;
      }
      
      public int getId(){
      return id;
      }
     
       public String getBookName(){
               return name;
       }
        public String getPublisher(){
               return publisher;
       }
        public  int getPrice(){
               return price;
       }
       public    String getPublishyear(){
               return publishyear;
       }

    
}
