package solution.set;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SubString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String 1: ");
		String s1 = sc.nextLine();

		System.out.print("Enter String 2: ");
		String s2 = sc.nextLine();

		System.out.println("Is it a substring :" + isSubString(s1, s2));
	}

	private static boolean isSubString(String s1, String s2) {
		boolean flag = false;

		Set<Character> set = s1.toLowerCase().chars().mapToObj(i -> (char) i).collect(Collectors.toSet());

		for (char ch : s2.toLowerCase().toCharArray()) {
			if (set.contains(ch)) {
				flag = true;
				break;
			}
		}

		return flag;
	}

}
