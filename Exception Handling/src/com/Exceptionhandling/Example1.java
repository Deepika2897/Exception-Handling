//NUMBERFORMATEXCEPTION
package com.Exceptionhandling;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		System.out.println("Before parseInt");
		
		
		try
		{
			System.out.println("inside try block");
			int i=Integer.parseInt(s);	
		}
		catch(NumberFormatException  e)
		{
		e.printStackTrace();
		}
		
	}

}
