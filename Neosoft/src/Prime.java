
public class Prime {
	static int sum = 0;

	public static int sum(int arr[]) {
		for (int i : arr) {
			sum = sum + i;
		}
		return sum;
	}

	public static boolean isSumPrime(int add) {
		if (sum == 0 || sum == 1) {
			return false;
		}
		if (sum == 2 || sum == 3 || sum == 5 || sum == 7) {
			return true;
		}

		if (sum % 2 == 0 || sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {
			return false;
		}
		return true;
	}

	public static int isPrime(int arr[]) {
		int sum = sum(arr);
		boolean sumPrime = isSumPrime(sum);
		for (int i = sum; i < Integer.MAX_VALUE; i++) {
			if (sumPrime == true) {
				return 0;
			}
			if (sum == 0 || sum == 1) {
				sum++;
				continue;
			}

			if (sum == 2 || sum == 3 || sum == 5 || sum == 7) {
				break;
			}

			if (sum % 2 == 0 || sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {
				sum++;
				continue;
			} else {
				break;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int arr[] = {1, 5, 7};
		int prime = isPrime(arr);
		System.out.println(prime);
	}
}
