//USERDEFINEDEXCEPTION OR CUSTOMIZED EXCEPTION
package com.Exceptionhandling;

import java.util.Scanner;

class CheckAge extends Exception
{
	public CheckAge(String s)
	{
		super(s);//calls super class constructor (Exception class)
	}

}

public class UserDefinedExceptionEx {
	public static void main(String[] args)
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		age=sc.nextInt();
		try
		{
			if(age<18)
			{
				 CheckAge ob=new CheckAge("Not eligible for voting");
				 throw ob;
				
				// or throw new CheckAge("Not eligible for voting");
			}
			 else
			 {
				 System.out.println("You can vote");
			 }
			 }
		catch(CheckAge e)
		{
				 e.printStackTrace();
			 }
		sc.close();
			
	}
}

