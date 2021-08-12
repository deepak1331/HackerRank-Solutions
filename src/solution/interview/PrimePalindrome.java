package solution.interview;

import java.util.Scanner;

/***
 * A range will be passed to you, need to find out the number of prime
 * palindrome numbers available between that.
 * 
 * @author Deepak
 *
 */
public class PrimePalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the starting point of range : ");
		int start = sc.nextInt();
		System.out.print("Enter the ending point of range : ");
		int end = sc.nextInt();

		int count = 0;
		for (int i = start; i < end; i++) {
			if (isPalindrome(i))
				if (isPrime(i))
					count++;
		}
		System.out.println(count);
	}

	static boolean isPalindrome(int n) {
		String num = String.valueOf(n);
		if (num.trim().length() == 1)
			return true;
		else {
			StringBuilder sb = new StringBuilder(num.trim());
			return num.equals(sb.reverse().toString());
		}
	}

	static boolean isPrime(int n) {
		if (n == 1)
			return false;
		else {
			for (int i = 2; i < n; i++)
				if (n % i == 0)
					return false;
			return true;
		}
	}

}
