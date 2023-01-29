package home;

public class PattrenEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				
				if(i==1 || j==1 || i==5 || j==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println(":::::::::::::::::::::::::::::::::");
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("::::::::::::::::::::::::::::::::::");
		
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::::");
		
		for(int i=1;i<=4;i++) {
		
			for(int j=1;j<=4-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println(":::::::::::::::::::::::::::::::::::::::::");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println(":::::::::::::::::::::::::::::::::::::::::");
		
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println(":::::::::::::::::::::::::::::::::::::::::");
		int n=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::::");
		
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				int sum=i+j;
				if(sum%2==0) {
					System.out.print("1 ");
				}
				else
				{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		System.out.println(":::::::::::::::::::::::::::::::::::::::::");
		
		 for(int i=1;i<=5;i++) {
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
			 }
			 for(int k=1;k<=2*(5-i);k++) {
				 System.out.print(" ");
			 }
			 for(int p=1;p<=i;p++) {
				 System.out.print("*");
			 }
			 
			 System.out.println();
		 }
		

		 for(int i=5;i>=1;i--) {
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
			 }
			 for(int k=1;k<=2*(5-i);k++) {
				 System.out.print(" ");
			 }
			 for(int p=1;p<=i;p++) {
				 System.out.print("*");
			 }
			 
			 System.out.println();
		 }
		 System.out.println(":::::::::::::::::::::::::::::::::::::::::");
		 
		 
		for(int i=1;i<=5;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=5;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::::");
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println(":::::::::::::::::::::::::::::::::::::::::");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			for(int k=2;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::::");
		
		 for(int i=1;i<=4;i++) {
			 for(int j=1;j<=4-i;j++) {
				 System.out.print(" ");
			 }
			 for(int k=1;k<=(2*i)-1;k++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 for(int i=4;i>=1;i--) {
			 for(int j=1;j<=4-i;j++) {
				 System.out.print(" ");
			 }
			 for(int k=1;k<=(2*i)-1;k++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		
		
		
		
		
	}	

}
