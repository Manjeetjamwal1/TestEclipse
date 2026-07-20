package day19_07;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = "manjeetSinghJamwal";
		str = str.toLowerCase();
		char arr[]=str.toCharArray();
		for(int i=0;arr.length>i;i++) {
			boolean isDuplicate=false;
			for(int j=i+1;arr.length>j;j++) {
			if(arr[i]==arr[j]) {
				isDuplicate=true;
				break;
			}
			}
			if(!isDuplicate) {
				System.out.print(arr[i]);
			}
		}
	}

}
