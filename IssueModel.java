/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagement;

/**
 *
 * @author Malhotra Computer
 */
public class IssueModel {
     private int id;
    private String bookName;
    //private int studentId;
    private String studentName;
   // private int bookId;
    private String issuedate;
    private String duedate;
 

    
      public IssueModel(int id,  String bookName, String studentName,  String issuedate ,String duedate){
          this.id = id;
          //this.studentId = studentId;
            this.bookName = bookName;
          this.studentName = studentName;
         // this.bookId = bookId;
        this.issuedate =  issuedate;
            this .duedate =  duedate;
      }
      
      public int getId(){
      return id;
      }
     
//       public int getstudentid(){
//            return studentId;
//       }
       public String getBookName(){
            return bookName;
       }
       public String getstudentName(){
          return studentName;
       }
       
//       public String getBookName(){
//            return bookName;
//       }
        public String getissuedate(){
             return  issuedate;
       }
        public String getduedate(){
            return duedate;
       }
       

    
}
