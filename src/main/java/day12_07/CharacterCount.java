package day12_07;

import java.util.Arrays;

public class CharacterCount {

	public static void main(String[] args) {
		String str = "my name is singh";
		int character = 0;
		String arr[] = str.split(" ");
		System.out.println(Arrays.toString(arr));
		for (int i = 0; arr.length - 1 >= i; i++) {
			System.out.print(arr[i] + " ");
			character++;
	
		}
		System.out.println(" ");
		System.out.println("character : "+character);

	}

}
