package solution.regex;

import java.util.Scanner;
import java.util.regex.Pattern;
/***
 * Problem Statement
 * The number should start with 7,8 or 9
 * The total numbers should be 10.
 * @author Deepak
 *
 */
public class MobileNumber {

	public static void main(String[] args) {

		System.out.print("Enter the Mobile Number to Validate: ");
		String str = new Scanner(System.in).nextLine();
		System.out.println("Is Valid Mobile Number : " + validate(str));
	}

	private static boolean validate(String str) {

		Pattern pattern = Pattern.compile("[789][0-9]{9}");
		return pattern.matcher(str).find();
	}

}
