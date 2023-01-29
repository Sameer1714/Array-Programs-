package home;

import java.util.Scanner;

public class Array3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int[][][] arr=new int[2][3][2];
		
		int[][][] arr2= {{{10,20},{30,40,50,60},{70,80,90}}};
		
		
		System.out.println("enter array :");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					arr[i][j][k]=sc.nextInt();
				}
			}
		}
		
		System.out.println("display arra element");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				for(int k=0;k<arr2[i][j].length;k++) {
					System.out.print(arr2[i][j][k]+" ");
				}
				System.out.println();
			}
			
		}
		sc.close();
	}

}
