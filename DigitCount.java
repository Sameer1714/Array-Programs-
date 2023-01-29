package home;

public class DigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=4444;
		int s=n;
		int sum=0;
		
		
		while(n>0) {
			
			//int rem=n%10;
			sum=sum*10+n%10;
			n=n/10;
			
		}
		System.out.println("Original No :"+s);
		System.out.println("Reverse No :"+sum);
		if(s==sum) {
			System.out.println("No is Pallindrome");
		}
		else {
			System.out.println("No is NOT palindrome");
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		String name="SaS";
		
		String temp="";
		
		for(int i=name.length()-1;i>=0;i--) {
			
			temp+=name.charAt(i);
		}
		System.out.println("Original String :"+name);
		System.out.println("Reverse String :"+temp);
		if(name.equals(temp)) {
			System.out.println("No is Pallindrome");
		}
		else {
			System.out.println("No is NOT palindrome");
		}
			
	}

}
