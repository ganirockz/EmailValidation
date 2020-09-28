package com.capgemini;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pattern pattern = Pattern.compile("^([a][b][c])[_+-.]([a-zA-Z]+)[@]([b][r][i][d][g][e][l][a][b][z][.][c][o])[.]([a-zA-Z]{2})$");
		while (true) {
			System.out.println("Do you want to enter Email address: \nselect \n1.yes\n2.no");
			int option = Integer.parseInt(sc.nextLine());
			if(option == 1) {
			System.out.println("Enter the EMail address to check pattern :");
			String input = sc.nextLine();
			Matcher m = pattern.matcher(input);
			if (m.find()) {
				System.out.println("Valid");
			} else {
				System.out.println("Not Valid");
			}
			}
			else{
				System.out.println("Thank you!");
				break;
			}
		}
		sc.close();
	}
}
