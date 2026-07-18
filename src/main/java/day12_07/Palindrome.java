package day12_07;

public class Palindrome {
	public static void main(String[] args) {
		String str = "madamj";

		String reverse = "";
		String original = str;
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			reverse = reverse + ch;

		}
		if (original.equalsIgnoreCase(reverse)) {
			System.out.println(original+": is a Palindrome");
		} else {
			System.out.println(original+": is not a palindrome");
		}
	}

}
