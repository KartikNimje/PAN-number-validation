package com.simplilearn;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PanNumberValidation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		String reg = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
		String PAN_NO;
		System.out.println("Enter the PAN Number : ");
		PAN_NO = sc.next();
		if(PAN_NO.length()>10)
		{
			System.out.println("Invalid PAN Number");
			return;
		}
		
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(PAN_NO);
		
		if(matcher.matches())
		{
			System.out.println("Valid PAN Number");
		}
		else
		{
			System.out.println("Invalid PAN Number");
		}
	}

}
