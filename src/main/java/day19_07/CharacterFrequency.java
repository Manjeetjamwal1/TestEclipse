package day19_07;

public class CharacterFrequency {

	public static void main(String[] args) {
		String str = "manjeetSinghJamwal";
		str = str.toLowerCase();
		char arr[]=str.toCharArray();
		for(int i=0;arr.length>i;i++) {
			int count=1;
			for (int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			  boolean alreadyPrinted = false;

	            for (int k = 0; k < i; k++) {

	                if (arr[i] == arr[k]) {
	                    alreadyPrinted = true;
	                    break;
	                }
		}
	            if (!alreadyPrinted) {
	                System.out.println(arr[i] + " = " + count);
	            }
	}
}
}