package Day03_07;

public class SmallestOfThreeNumbers {

	public static void main(String[] args) {
		int a = 3, b = 34, c = 1;
		if (a <= b && a <= c) {
			System.out.println(a + " is the smallest number");
		} else if (b <= a && b <= c) {
			System.out.println(b + " is the smallest number");
		} else {
			System.out.println(c + " is the smallest number");
		}
	}

}
