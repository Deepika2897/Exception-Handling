package com.Exceptionhandling;

import java.util.Scanner;
public class DivideError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number:");
a=sc.nextInt();
System.out.println("Enter the second number:");
b=sc.nextInt();
System.out.println("Before division:");
try
{
	System.out.println("it is in try block");
	c=a/b;
}
catch(ArithmeticException e)
{
	e.printStackTrace();
	System.out.println("catch block will execute when there is an error");
}
finally
{
	System.out.println("finally block");
	sc.close();
}
	}

}
