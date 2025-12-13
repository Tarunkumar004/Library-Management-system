/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Malhotra Computer
 */
public class SingletonClass {
    Connection connection = null;
    
    private static SingletonClass singletonClass = null;
    
    private SingletonClass(){
        //jdbc:mysql://localhost:3306/librarym?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]
        //jdbc:mysql://localhost:3306/6weekbatch?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]
        
        //jdbc:mysql://localhost:3306/librarym?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]
      try{
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarym","root","");
      System.out.println("Database Connected!");
      if(connection!=null){
          
          String studentinformation  = "CREATE TABLE IF NOT EXISTS studentinformation(id INT AUTO_INCREMENT, name varchar(50), branch varchar(225), fatherName varchar(225), contactNo varchar(225), collegeName varchar(225), PRIMARY KEY(id))";
         PreparedStatement ps = connection.prepareStatement(studentinformation);
         ps.execute();
         
           
          String addbooks  = "CREATE TABLE IF NOT EXISTS addbooks(id INT AUTO_INCREMENT, name varchar(225), publisher varchar(225), price varchar(225), publisheryear  varchar(225) , PRIMARY KEY(id))";
         PreparedStatement ps1 = connection.prepareStatement(addbooks);
         ps1.execute();
         //issuedate varchar(225), duedate varchar(225) ,
         String issuebook  = "CREATE TABLE IF NOT EXISTS issuebook(id INT AUTO_INCREMENT, studentId INT, bookName varchar (255), studentName varchar(30), issuedate varchar(30),  duedate varchar(30) ,  PRIMARY KEY(id))";
         PreparedStatement ps2 = connection.prepareStatement(issuebook);
         ps2.execute();
         
         String returnbook  = "CREATE TABLE IF NOT EXISTS returnbook  ( id INT AUTO_INCREMENT,  issueId INT, studentName varchar(50), bookName varchar(50), issuedate varchar(50), duedate varchar(50), bookReturnDate varchar(50), fine DOUBLE,  PRIMARY KEY(id))";
         PreparedStatement ps3 = connection.prepareStatement(returnbook);
         ps3.execute(); 
         
         String studentreport  = "CREATE TABLE IF NOT EXISTS studentreport  (studentid  INT AUTO_INCREMENT , name varchar (255), grade int(11), booksborrowed varchar(255), overduebooks varchar(255),   PRIMARY KEY(studentid))";
         PreparedStatement ps4 = connection.prepareStatement(studentreport);
         ps4.execute();
         }
      //else if(connection!=null){
        //id INT AUTO_INCREMENT,
        //studentid INT AUTO_INCREMENT
        // }
      
      
      
      
      }catch(SQLException exception){
          System.out.println("SQLException :"+exception);
      }
    
    }
    
    public static SingletonClass getInstance(){
    if(singletonClass == null){
        singletonClass = new SingletonClass();
    }
    return singletonClass;
        
    }
    
    
    
}

