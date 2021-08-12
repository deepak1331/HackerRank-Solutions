package solution.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindThePair {

	public static void main(String[] args) {

		Integer[] arr = { 1, 5, 7, 9, 12, 4, 6, 11, 19, 13 };
		Arrays.sort(arr);
		int total = 11;
		int low = 0;
		int high = 0;
		// find the pair
		int a, b;
		if (arr != null && arr.length > 0) {
			low = 0;
			high = arr.length - 1;

			for (int i = 0; i < arr.length - 1; i++) {
				a = arr[low];
				b = arr[high];
				if ((a + b) == total) {
					System.out.println("Pair : " + arr[low] + " and " + arr[high]);
					break;
				} else if ((a + b) < total)
					low++;
				else
					high++;
			}
			System.out.println("No valid pair found");
		}

//		for (int i = 0; i < arr[i]; i++) {
//			if (set.contains(total - arr[i])) {
//				System.out.println("Pair :" + arr[i] + " and " + (total - arr[i]));
//				break;
//			}
//		}

	}
}
