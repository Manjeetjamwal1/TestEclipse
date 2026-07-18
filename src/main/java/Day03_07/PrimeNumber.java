package Day03_07;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 73;
		boolean isPrime = true;
		if (n <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					isPrime = false;
				}
			}
		}

		if (isPrime) {
			System.out.print("is Prime");
		} else {
			System.out.println("is not a prime:");
		}
	}

}
