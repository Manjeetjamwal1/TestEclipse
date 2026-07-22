package MedintelX_Interview;

public class LargestArray {

	public static void main(String[] args) {
		int arr[]= {11,33,22,14,12,17,19,29898};
		int large=arr[0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]>large) {
					large=arr[i];
					
				}
			}
		}System.out.println(large);

	}

}
