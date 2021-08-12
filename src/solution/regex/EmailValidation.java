package solution.regex;

import java.util.Scanner;
import java.util.regex.Pattern;
/***
 * Problem Statement
 * The username should start with Uppercase, should contain lowercase alphabets, only one digit is allowed in between
 * @author Deepak
 *
 */
public class EmailValidation {

	public static void main(String[] args) {

		System.out.print("Enter the username to validate: ");
		String str = new Scanner(System.in).nextLine();
		System.out.println("Is Valid Username/password : " + validate(str));
	}

	private static boolean validate(String str) {

		Pattern pattern = Pattern.compile("[A-Z][a-z]*[0-9]{1}[A-Z]*");
//		Pattern pattern = Pattern.compile("[a-zA-A0-9]");
		return pattern.matcher(str).find();
	}

}
