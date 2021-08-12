package solution.stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.print("Enter the input string : ");
		String str = new Scanner(System.in).nextLine();
		System.out.println("Input String : " + str);
		System.out.println("Is Balanced : " + isBalanced(str));
	}

	public static boolean isBalanced(String str) {
		Stack<Character> s = new Stack<>();

		for (char ch : str.toCharArray()) {
			// Push left braces if available
			if (ch == '{' || ch == '(' || ch == '[')
				s.push(ch);
			else if ((ch == '}' && s.peek() == '{' && !s.isEmpty()) || (ch == ')' && s.peek() == '(' && !s.isEmpty())
					|| (ch == ']' && s.peek() == '[' && !s.isEmpty()))
				s.pop(); // pop the top element, since we got a matching pair
		}
		return s.isEmpty();
	}

}
