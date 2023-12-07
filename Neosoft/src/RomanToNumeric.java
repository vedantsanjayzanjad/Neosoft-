import java.util.HashMap;
import java.util.Scanner;

public class RomanToNumeric {

	public static int StringToRoman(String str, HashMap<Character, Integer> map) {
		String input = str.toUpperCase();
		int numericValue = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			numericValue = numericValue + map.get(input.charAt(i));
		}
		return numericValue;
	}

	public static HashMap<Character, Integer> romanData() {
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		return map;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String");
		String str = sc.nextLine();
		HashMap<Character, Integer> romanData = romanData();
		int stringToRoman = RomanToNumeric.StringToRoman(str, romanData);
		System.out.println("roman value " + str + " Numeric Value " + stringToRoman);
		sc.close();
	}
}
