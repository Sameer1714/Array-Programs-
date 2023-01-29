package home;

public class ChechPrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int flag=0;
		for(int i=3;i<=100;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=1;
					
				}
				else if(flag==0) {
					System.out.println(i);
				}
			}
			
		}
	}

}
