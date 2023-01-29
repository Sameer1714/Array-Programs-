package home;

import java.util.Scanner;

public class ArrayEvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int[] arr=new int[5];
		
		System.out.println("Enter 1D Array :");
		for(int i=0;i<arr.length;i++) 
		{
				arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("Even No in Array : "+arr[i]+" ");
			}
		}
		
		sc.close();
	}

}
