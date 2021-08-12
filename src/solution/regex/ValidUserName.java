package solution.regex;

import java.util.Scanner;
import java.util.regex.Pattern;
/***
 * Problem Statement
 * Validate a email ID: e.g deepak123@gmail.com
 * @author Deepak
 *
 */
public class ValidUserName {

	private static final String EMAIL_REGEX ="^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	

	public static void main(String[] args) {

		System.out.print("Enter the username to validate: ");
		String str = new Scanner(System.in).nextLine();
		System.out.println("Is Valid Username/password : " + validate(str));
	}

	private static boolean validate(String str) {
		Pattern pattern = Pattern.compile(EMAIL_REGEX);
		return pattern.matcher(str).find();
	}

}
