package com.Exceptionhandling;

import java.util.Scanner;

public class UserAndNullException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstname;
		String lastname =null;
Scanner sc=new Scanner(System.in);

try {
	System.out.println("Enter the firstname");
	firstname=sc.nextLine();
	System.out.println("firstname="+firstname);
}
catch(NullPointerException e)
{
	e.printStackTrace();
	
}
sc.close();
	}

	
}
