package Day05_07;

public class Amstong {

	public static void main(String[] args) {
		int num=153;
		int sum=0;
		int orignal=num;
		while(num>0) {
			int digit=num%10;
			sum=sum+(digit*digit*digit);
			num=num/10;
		}
		if(orignal==sum) {
			System.out.println(sum+" :is Amstrong");
		}else {
			System.out.println(sum+" :is not Amstrong");
		}
	}

}
