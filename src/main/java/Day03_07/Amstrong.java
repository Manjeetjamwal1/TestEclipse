package Day03_07;

public class Amstrong {

	public static void main(String[] args) {
		int n = 372;
		int orignal=n;
		int sum = 0;
		while (n>0){
		int digit=n%10;	
		sum=sum+(digit*digit*digit);
		n=n/10;
		}
	if (sum==orignal) {
		System.out.println(orignal+" is Amstrong:");
	}else {
		System.out.println(orignal+" is not a Amstrong:");
	}
	}

}
