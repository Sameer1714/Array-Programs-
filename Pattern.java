package home;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=5;i++) {
			
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=1;k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::::");
		
		for(int i=5;i>=1;i--) {
			for(int j=i;j<=5;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println(":::::::::::::::::::::::::::::::::::");
		
for(int i=1;i<=5;i++) {
			
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=1;k++) {
				System.out.print("*");
			}
			System.out.println();
			
			if(i==5) {
				
				for(int w=5-1;w>=1;w--) {
					for(int j=w;j<=5;j++) {
						System.out.print(" ");
					}
					for(int k=1;k<=1;k++) {
						System.out.print("*");
					}
					System.out.println();
				}
				
			}
			
		}
		
	}

}
