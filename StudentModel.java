/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagement;

/**
 *
 * @author Malhotra Computer
 */
public class StudentModel {
    private int id;
    private String name;
    private String branch;
    private String fatherName;
    private String contactNo;
    private String collegeName;

    
      public StudentModel(int id, String name,String branch,String fatherName, String contactNo,String collegeName){
          this.id = id;
          this.name = name;
        this .branch =  branch;
          this .fatherName =  fatherName;
            this .contactNo =  contactNo;
              this .collegeName =  collegeName;
      }
      
      public int getId(){
      return id;
      }
      
       public String getName(){
      return name;
      }
     
       public String getBranch(){
               return branch;
       }
        public String getFathername(){
               return fatherName;
       }
        public  String getContactNo(){
               return contactNo;
       }
       public    String getCollegeName(){
               return collegeName;
       }

      
      }

    
    
    
    
    
    
