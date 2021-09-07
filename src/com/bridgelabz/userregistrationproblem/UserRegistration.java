package com.bridgelabz.userregistrationproblem;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {

		System.out.println("enter first name");
		Scanner scanner = new Scanner(System.in);
		String firstName = scanner.next();
		if (validate(firstName))
			System.out.println("valid firstName");
		else
			System.out.println("inavlid first name");
	}

	private static boolean validate(String firstName) {
		String nameValidation = "^[A-Z][A-Za-z]{2,}$";
		return Pattern.matches(nameValidation, firstName);
	}

}
