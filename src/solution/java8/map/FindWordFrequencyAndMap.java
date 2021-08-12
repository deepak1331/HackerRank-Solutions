package solution.java8.map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindWordFrequencyAndMap {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the no of words you want to enter : ");
//		int n = sc.nextInt();
//		sc.nextLine();
//		List<String> list = new ArrayList(n);
//		for (int i = 0; i < n; i++) {
//			System.out.print("Enter String: ");
//			list.add(sc.nextLine());
//		}
//		HashMap<String, String> map = list.stream().map(s -> s.split(" ")).collect(Collectors.toMap(s -> s[0], s -> s[1]));

		List<String> list = Arrays.asList("Car", "Bike", "Cat", "Cat", "Cart", "Car", "Apple", "Banana", "Ball", "Ball",
				"Boy");
		System.out.println("User Input : " + list);

		Map<String, Long> wordFreqMap = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		printHeader("Word      Frequency");
		wordFreqMap.forEach((k, v) -> {
			System.out.printf("%-12s%2d\n", k, v);
		});
		
		
		Map<Object, Object> sortedMap = wordFreqMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldVal, newVal) -> oldVal,
						TreeMap::new));
		printHeader("Word      Frequency (After sorting by Value)");
		sortedMap.forEach((k, v) -> {
			System.out.printf("%-12s%2d\n", k, v);
		});
	}

//	public Map<String, Long> convertToMap(List list){
//		return 
//	}
	
	public static void printHeader(String str) {
		System.out.println("====================================================");
		System.out.println(str);
		System.out.println("===================================================="); 
	}

}
