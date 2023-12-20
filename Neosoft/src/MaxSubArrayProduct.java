
public class MaxSubArrayProduct {
	public static void main(String[] args) {

		int arr[] = { 2, 3, -2, 4 };
		int i = maxProduct(arr);
		System.out.println(i);

	}

	private static int maxProduct(int[] arr) {

		int n = arr.length;
		int maxProduct = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			int currentProduct = 1;
			for (int j = i; j < n; j++) {
				currentProduct *= arr[j];
				maxProduct = Math.max(maxProduct, currentProduct);
			}
		}

		return maxProduct;
	}
}
