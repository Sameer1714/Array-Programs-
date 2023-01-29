package home;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int[][] arr1=new int[3][3];
		int[][] arr2=new int[3][3];
		int[][] arr3=new int[3][3];
		
		System.out.println("Enter Array1 : ");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				
				arr1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter Array2 : ");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				
				arr2[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter Array3 : ");
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3.length;j++) {
				
				arr3[i][j]=sc.nextInt();
			}
		}
		
		
		
		System.out.println(" Array1\t Array2 \t Array3");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.print("   ");
			for(int k=0;k<arr2.length;k++) {
				System.out.print(arr2[i][k]+" ");
			}
			System.out.print("   ");
			for(int p=0;p<arr3.length;p++) {
				System.out.print(arr3[i][p]+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
