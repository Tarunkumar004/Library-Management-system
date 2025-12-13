/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagement;

/**
 *
 * @author Malhotra Computer
 */
public class ReturnModel {
    private int id;
    private int issueId;
    private String studentName;
    private String bookName;
    private String issuedate;
    private String duedate;
    private String bookReturnDate;
    private double fine;
  
   

    
      public ReturnModel(int id,  int issueID, String studentName, String bookName ,String issuedate ,String duedate, String bookReturnDate, double fine){
         // this.id = id;
          this.id = id;
          this.issueId = issueId;
          this .studentName =  studentName;
          this .bookName =  bookName;
          this.issuedate = issuedate;
          this.duedate = duedate;
          this .bookReturnDate =  bookReturnDate;
          this .fine =  fine;
                
      }
      
     // public int getId(){
      //return id;
      //}
     
       public int  getid(){
               return id;
       }
       public int getissueID(){
               return issueId;
       }
        public String getstudentName(){
               return  studentName;
       }
        public  String getbookName(){
               return bookName;
       }
      public String getissuedate(){
               return issuedate;
       }
       public String getduedate(){
               return duedate;
       }
        public String getbookReturnDate(){
               return  bookReturnDate;
       }
        public  double getfine(){
               return fine;
       }


    
}
