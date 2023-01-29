package home;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=5;i++) {
			
			for(int j=i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=1;k++) {
				System.out.print("*");
			}
			System.out.println();
			if(i==5) {
				
				for( int d=i-1;d>=1;d--) {
					for(int e=d;e>=1;e--) {
						System.out.print(" ");
					}
					for(int x=1;x<=1;x++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}
	}

}
