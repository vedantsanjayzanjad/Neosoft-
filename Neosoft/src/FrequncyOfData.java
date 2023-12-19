import java.util.*;
import java.util.stream.Collectors;

public class FrequncyOfData {

	static List<Integer> getFrequneceData(List<Integer> list, int k) {
		
		List<Integer> frequentData = list.stream().filter(e -> Collections.frequency(list, e) >= k)
				.collect(Collectors.toList());
		List<Integer> uniqueFromFrequentData = frequentData.stream().distinct().collect(Collectors.toList());

		return uniqueFromFrequentData;
	}

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 1, 1, 2, 2, 3);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Value of K ");
		int k = scanner.nextInt();
		List<Integer> frequneceData = getFrequneceData(list, k);
		System.out.println(frequneceData);

	}
}
