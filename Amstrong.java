package home;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=8808,temp=n,s=n;
		
		int rem,am=0,digit=0;
		
		while(s>0) {
			s=s/10;
			digit++;
		}
		
		
		
		while(temp!=0) {
			
			rem=temp%10;
			
			am+=(Math.pow(rem,digit));
			temp=temp/10;
		}
		if(n==am)
		System.out.println(n+" is Amstrong Number");
		else
			System.out.println("THis is not Amstong");
	}

}
