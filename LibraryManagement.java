/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.librarymanagement;

/**
 *
 * @author Malhotra Computer
 */
public class LibraryManagement {

    public static void main(String[] args) {
        System.out.println("Hello  welcome to the library management project!");
        //Studentpage screen =  new Studentpage();
     // LibraryDashboard screen =  new LibraryDashboard();
     // Homepage screen =  new Homepage();
      //AddBook screen = new AddBook();
     // AddBook screen =  new AddBook();
      SingletonClass conn=SingletonClass.getInstance();
      //STable screen =new STable();
        LibraryDashboard screen =  new LibraryDashboard();
       //IssueBooks screen =new IssueBooks();
         screen.setVisible(true);
      
  
    }
}
