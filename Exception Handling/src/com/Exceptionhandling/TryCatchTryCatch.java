package com.Exceptionhandling;

public class TryCatchTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0,c=0;
		int ar[]=new int[4];
		System.out.println("Before exception");
		try
		{
			System.out.println("Inside try block");
			c=a/b;//Arithmetic expression
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
			e.printStackTrace();
		}
		try
		{
			ar[6]=9;//ArrayIndexOutOfBoundsException 
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
	System.out.println("ArrayIndexOutOfBoundsException");
	e.printStackTrace();
		}
		finally
		{
			System.out.println("Finally block");
		}
		
	}

}
