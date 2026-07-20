package day19_07;

public class WordCount {

	public static void main(String[] args) {
		String str = "my name is singh";
		int wordCount = 0;
		String arr[] = str.split(" ");
		for (int i = 0; arr.length > i; i++) {
			System.out.print(arr[i] + " ");
			wordCount++;
		}
		System.out.println(" ");
		System.out.println("WordCount :" + wordCount);
	}

}
