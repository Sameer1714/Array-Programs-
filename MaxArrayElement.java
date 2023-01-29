package home;

import java.util.Scanner;

public class MaxArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        
		int[] arr=new int[5];
		
		System.out.println("Enter 1 D Array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		
		System.out.println("Max Element of Array :"+max);
		sc.close();
	}

}
