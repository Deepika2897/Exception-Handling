package com.Exceptionhandling;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name;
int age;
float salary;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age:");
age=sc.nextInt();
System.out.println("Enter the name:");
name=sc.next();
System.out.println("Enter the salary:");
salary=sc.nextFloat();
System.out.println("Name="+name);
System.out.println("Age="+age);
System.out.println("Salary="+salary);
sc.close();
	}

}
