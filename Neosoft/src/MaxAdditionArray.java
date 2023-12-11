import java.util.Scanner;

public class MaxAdditionArray {

	public static int findMaxSubArrayAddition(int[] a, int k) {

		int maxSum = 0;
		int subarrayAddition = 0;

		for (int i = 0; i <= a.length - k; i++) {
			subarrayAddition = 0;
			for (int j = i; j < i + k; j++) {
				subarrayAddition = subarrayAddition + a[j];
			}
			maxSum = Math.max(maxSum, subarrayAddition);
		}

		return maxSum;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}

		scanner.close();

		System.out.printf("Max sum subarray Additiom is " + findMaxSubArrayAddition(a, k));
	}

}
