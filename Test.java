package com.virtual.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.virtualknowledge.inheritance.Parent;

public class Test {
static	String name="kpr";
	public static void main1(String[] args) throws IOException {
	
	 
	//System.out.println(Test.name.length());
	
	   // system.in for accept data from keyboard
	   // InputStreamReader reading data from keyboard 
	   // loads entire content in single slot
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   /*System.out.println("enter a character");
	  char ch=(char) br.read();
	  System.out.println("character entered by user is"+ch);*/
	  
	  System.out.println("enter a firstname");
	  String firstName=br.readLine();
	  
	  System.out.println("enter a Lastname");
	  String lastName=br.readLine();
	  
	  System.out.println("enter a integer");
	  Long longValue =Long.parseLong((br.readLine()));
	  
	  	Parent parent=new Parent(firstName,lastName,longValue);
		parent.talking();
		
	
	}
	
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		
		 System.out.println("enter a firstname");
		 String firstName=sc.next();
		 
		 System.out.println("enter a Lastname");
		  String lastName=sc.next();
		 System.out.println("enter a long");
		 Long longValue =sc.nextLong();*/
		/* Parent parent=new Parent(firstName,lastName,longValue);
			parent.talking();*/
		 
		 System.err.println("hai this is kpr");
	}

}
