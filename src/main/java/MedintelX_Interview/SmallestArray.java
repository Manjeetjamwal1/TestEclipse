package MedintelX_Interview;

public class SmallestArray {
	public static void main(String[] args) {
	
	int arr[]= {11,33,22,14,12,17,19,2};
	int small=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]<small) {
			small =arr[i];
		}
		
	}
System.out.println(small);
}
}