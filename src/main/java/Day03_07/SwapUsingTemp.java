package Day03_07;

public class SwapUsingTemp {

	public static void main(String[] args) {
		int x=17;
		int y=23;
		int temp;
		System.out.println("Before Swap value of x: "+x);
		System.out.println("Before Swap value of y: "+y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("After Swap value of x: "+x);
		System.out.println("After Swap value of y: "+y);

	}

}
