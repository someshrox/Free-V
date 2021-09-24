package com.igniters.somesh;
import java.util.Scanner;

public class scanner {
	  public static void main(String[] args) {
		    Scanner myObj = new Scanner(System.in);
		    
		    // Enter username and press Enter
		    System.out.println("Enter username "); 
		    String userName = myObj.next();      
		    System.out.println("Username is: " + userName);        
		  }
}
