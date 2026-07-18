package day12_07;

public class ReverseString {
	public static void main(String[] args) {
		String str="my name is manjeet";
		int num=str.length()-1;
		String reverse="";
		for(int i=num;i>=0;i--) {
			char ch=str.charAt(i);
			reverse=reverse+ch;
			
		}
		System.out.println(reverse);
	}

}
