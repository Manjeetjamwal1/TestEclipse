package Day05_07;

public class Palindrone {

	public static void main(String[] args) {
		int num=121;
		int sum=0;
		int orignal=num;
		while(num>0) {
			int digit=num%10;
			sum=sum*10+digit;
			num=num/10;
			
		}

		if(sum==orignal) {
			System.out.println(sum+" is palidrone:");
		}else {
			System.out.println(sum+" is not a palidrone:");
		}
		
	}

}
