import java.util.*;
import java.util.stream.Collectors;

public class TripletArray {

	public static Set<List<Integer>> tripleArray(int[] nums) {

		List<Integer> listOfInteger = Arrays.stream(nums).mapToObj(e -> e).collect(Collectors.toList());

		Set<List<Integer>> finalOutput = listOfInteger.stream().distinct()
				.flatMap(a -> listOfInteger.stream().distinct().filter(b -> !b.equals(a))
						.flatMap(b -> listOfInteger.stream().distinct().filter(c -> !c.equals(a) && !c.equals(b))
								.filter(c -> a + b + c == 0).map(c -> Arrays.asList(a, b, c))))
				.collect(Collectors.toSet());

		return finalOutput;

	}

	public static void main(String[] args) {

		int[] nums = { -1, 0, 1, 2, -1, -4 };

		Set<List<Integer>> threeSum = tripleArray(nums);
		System.out.println(threeSum);
	
	}
}
