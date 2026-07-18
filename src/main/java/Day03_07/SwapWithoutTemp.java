package Day03_07;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		int x = 17;
		int y = 23;

		System.out.println("Before Swap value of x: " + x);
		System.out.println("Before Swap value of y: " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After Swap value of x: " + x);
		System.out.println("After Swap value of y: " + y);
	}
}
