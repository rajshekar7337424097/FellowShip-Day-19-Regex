package com.bl.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordUC6 {
	public boolean passwordRule1(String inputStr) {
		String passwordPattern = "^(?=.*[A-Z])[A-Za-z]{8}$";
		Pattern regex = Pattern.compile(passwordPattern);
		Matcher passwordMatcher = regex.matcher(inputStr);
		if(passwordMatcher.matches()) {
			System.out.println(inputStr+"Enter password as per rule 2 ");
			
		}else {
			System.out.println(inputStr+"Invalid Password");
		}
		return false;
	}
	
	public static void main(String[] args) {
		PasswordUC5 password = new PasswordUC5();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 8 characher  with one Upper case password for Login");
		String inputStr= sc.nextLine();
		sc.close();
		password.passwordRule1(inputStr);
	}
}
