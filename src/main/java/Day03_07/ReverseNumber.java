package Day03_07;

public class ReverseNumber {
	public static void main(String[] args) {
		int num = 256;
		int reverse = 0;
		while(num > 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		System.out.println(reverse);
	}

}
