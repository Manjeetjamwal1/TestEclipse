package day12_07;

public class VowelConsonantCount {
	public static void main(String args[]) {
		String str = "my1 name4 is3 singh1";
		str=str.toLowerCase();
		for (int i = 0; str.length() - 1 >= i; i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println("Vowels : "+ch);
				
			}else if (ch==' '){
				System.out.println("Space : "+ch);
			}
			else if(Character.isDigit(ch)) {
				System.out.println("Number : "+ch);
			}
			else {
				System.out.println("Consonant : "+ch);
			}
		}
	}

}
