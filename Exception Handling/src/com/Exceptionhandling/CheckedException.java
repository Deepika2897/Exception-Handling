package com.Exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name="Deepika";
		int age=0;
		float sal=0.0f;
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		//or
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in);
		System.out.println("Enter your name");
		name = br.readLine();
		System.out.println("Enter age");
		age=Integer.parseInt(br.readLine());
		System.out.println("Enter sal");
		sal=Float.parseFloat(br.readLine());
		System.out.println("Details of Employee");
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("sal="+sal);
	}
	

	}

