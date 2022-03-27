package com.Exceptionhandling;

import java.util.Scanner;
public class ArrayRunTimeError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements:");
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=sc.nextInt();	
		}
		System.out.println("Array elements are");
		for(int i=0;i<a.length+1;i++)
		{
			try
			{
				System.out.println(a[i]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();
				sc.close();
			}
		}
		System.out.println("statements after for loop");
	}
	
}
