package home;

import java.util.Scanner;

public class Addittion2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int[][] arr1=new int[3][3];
		int[][] arr2=new int[3][3];
		
		System.out.println("Enter Array1 :");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter Array2 :");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		
		int[][] arr3=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		
		System.out.println("Addition of 2D Array :");
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3.length;j++) {
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
