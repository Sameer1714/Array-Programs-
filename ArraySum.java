package home;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int[] a=new int[5];
		int sum=0;
		
		System.out.println("Enter Array :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		
		
		
		System.out.println("Arry:");
		for(int i:a) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		System.out.println("Sum of Array Element :"+sum);
		
		sc.close();
	}

}
