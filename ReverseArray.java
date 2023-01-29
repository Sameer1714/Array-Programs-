package home;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,34,56,7,89,90,45};
		
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		
		int temp=arr[0];
		for(int k=1;k<arr.length;k++) {
			
			arr[k-1]=arr[k];
			if(k==arr.length-1) {
				arr[k]=temp;
			}
		}
		System.out.println();
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		
		int temp2=arr[arr.length-1];
		for(int k=arr.length-1;k>0;k--) {
			arr[k]=arr[k-1];
			if(k==1) {
				arr[0]=temp2;
			}
		}
		
		System.out.println();
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		
	}

}
