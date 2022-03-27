//BANKING APPLICATION PROGRAM USING CUSTOMIZED EXCEPTION OR USERDEFINED EXCEPTION
package com.Exceptionhandling;

import java.util.Scanner;

//userdefined Exception class
class BankException extends Exception
{
	public BankException(String s)
	{
		super(s);
	}
}
class SBIBank
{
	int bankbalance;
	public SBIBank()
	{
		bankbalance=50000;
	}
	void withDraw(int withDrawamt)
	{
		try
		{
			if(withDrawamt>bankbalance)
			{
				throw new BankException("Insufficient Balance");
			}
			else
			{
				bankbalance=bankbalance-withDrawamt;
				System.out.println("Balance amount="+bankbalance);
			}
		}
			
			catch(BankException e)
			{
				e.printStackTrace();
			}
		}
	}
	
		
public class MainBank {
	public static void main(String[] args)
	{
		SBIBank sob=new SBIBank();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to withDraw");
		int amt=sc.nextInt();
		sob.withDraw(amt);
	}

}
		
	
	
