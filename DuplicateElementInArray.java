package home;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class DuplicateElementInArray
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int cnt=0;
		int[] arr= {10,2,3,4,2,45,4,2};
		
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=1+i;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					cnt++;
					break;
				}				
			}
		}
		System.out.println("Duplicate : "+cnt);
		System.out.println("---------------------------------------");
		
		for(int i=0;i<arr.length;i++) {
			int flag=0;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					flag++;
					break;
				}
			}
			if(flag==0) {
				if(arr[i]+arr[i+1]==5) {
					System.out.println("unique element unique pair : "+arr[i]+" "+arr[i+1]+" ");
					break;
				}
			}
		}
		System.out.println("-------------------------------------------");
		LinkedHashSet<Integer> ls=new LinkedHashSet<>();
		for(int i:arr) {
			if(ls.add(i)) {
				
			}
			
		}
		System.out.println(ls);
		System.out.println("------------------------------");
		//unique pairs  in array
		System.out.println("pairs sum = 5");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==5) {
					System.out.println(arr[i]+" "+arr[j]);
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("----------------------------");
		System.out.println("TRiplate pair");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==9)
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					     break;
				}
			}
		}
	}

}
