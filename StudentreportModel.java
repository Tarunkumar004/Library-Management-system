/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagement;

/**
 *
 * @author Malhotra Computer
 */
public class StudentreportModel {
    private int id;
    private String name;
    private int grade;
    private String booksborrowed;
    private String overduebooks;

    
      public StudentreportModel(int id,String name, int grade,String booksborrowed,String overduebooks){
           this.id = id;
          this .name = name;
          this .grade = grade;
          this .booksborrowed =  booksborrowed;
          this .overduebooks =  overduebooks;
      }
      
      public int getId(){
      return id;
      }
     
       public String getname(){
               return name;
       }
        public int getgrade(){
               return grade;
       }
        public  String getbooksborrowed(){
               return booksborrowed;
       }
       public    String getoverduebooks(){
               return overduebooks;
       }
    
}
