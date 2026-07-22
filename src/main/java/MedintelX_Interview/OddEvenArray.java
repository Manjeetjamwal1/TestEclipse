package MedintelX_Interview;

public class OddEvenArray {

	public static void main(String[] args) {
		int arr[]= {11,33,22,14,12,17,19};
		for(int i=1;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("Even No: "+arr[i]);
			}else {
				System.out.println("Odd No : "+arr[i]);
			}
		}

	}

}
