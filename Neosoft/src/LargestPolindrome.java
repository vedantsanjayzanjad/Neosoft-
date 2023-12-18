import java.util.Scanner;

public class LargestPolindrome {

	private static String findLongestPalindromicSubstring(String input) {
		if (input.isEmpty()) {
			return "";
		}

		int n = input.length();
		int longestIndex = 0, startIndex = 0, endIndex = 0;
		boolean[][] palindrom = new boolean[n][n];

		for (int j = 0; j < n; j++) {
			palindrom[j][j] = true;
			
			for (int i = 0; i < j; i++) {
				if (input.charAt(i) == input.charAt(j) && (j - i <= 2 || palindrom[i + 1][j - 1])) {
					palindrom[i][j] = true;

					if (j - i + 1 > longestIndex) {
						longestIndex = j - i + 1;
						startIndex = i;
						endIndex = j;
					}
				}
			}
		}
		return input.substring(startIndex, endIndex + 1);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		System.out.println(findLongestPalindromicSubstring(input));
	}
}