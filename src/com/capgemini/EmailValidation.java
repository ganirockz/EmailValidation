package com.capgemini;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pattern pattern = Pattern.compile("^([a][b][c])+");
		System.out.println("Enter the EMail address to check pattern :");
		String input = sc.nextLine();
		Matcher m = pattern.matcher(input);
		if (m.find()) {
			System.out.println("Valid");
		} else {
			System.out.println("Not Valid");
		}
		sc.close();
	}
}
