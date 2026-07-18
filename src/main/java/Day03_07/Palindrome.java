 package Day03_07;

public class Palindrome {

	public static void main(String[] args) {
		int n = 123;
		int orignal = n;
		int reverse = 0;
		while (n > 0) {
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n / 10;
		}
		if (orignal == reverse) {
 
			System.out.println(orignal + " is a Palindrome:");
		} else {
			System.out.println(orignal + " is not a Palindrome:");
		}
	}

}
