package day20_07;

public class RemoveSpecialCharcter {

	public static void main(String[] args) {
		 String str = "Ja@va#12$3!";

	        str = str.replaceAll("[^a-zA-Z]", "");

	        System.out.println(str);
	}

}
