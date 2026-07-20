package day19_07;



public class ReverseEachWord {
	public static void main(String[] args) {
		String str = "naresh it is cheap and best insitute in Ammerpet";
		String arr[] = str.split(" ");
		String reverse = "";
		
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			System.out.print(word +" ");
			for (int j = word.length() - 1; j >= 0; j--){
				char ch = word.charAt(j);
				reverse = reverse + ch;
			}
			reverse = reverse + " ";
		}
		System.out.println(" ");
		
		System.out.print(reverse);
	}

}
