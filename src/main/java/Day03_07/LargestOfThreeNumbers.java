package Day03_07;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int a = 23, b = 34, c = 8;
		if (a >= b && a >= c) {
			System.out.println(a + " is the largest number");
		} else if (b >= a && b >= c) {
			System.out.println(b + " is the largest number");
		} else {
			System.out.println(c + " is the largest number");
		}
	}

}
