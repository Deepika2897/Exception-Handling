//NUMBERFORMATEXCEPTION
package com.Exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num;
//while(true)
for(;;)
{
	System.out.println("Enter valid number:");
	try
	{
		//num=sc.nextInt();
		 num=Integer.parseInt(sc.next());
		break;//while loop
		}
	catch(NumberFormatException e)
	{
		e.printStackTrace();
	}
	catch(InputMismatchException e)
	{
		e.printStackTrace();
	}
	sc.close();
System.out.println("Please valid integer only");
}
System.out.println("Input is valid");
}
	}


