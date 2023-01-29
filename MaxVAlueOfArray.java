package home;

public class MaxVAlueOfArray 
{
	public static void main(String[] args) 
	{
	     int[] arr= {78,90,12,34,56,7,67,80,5,89,1,677};
	     
	     int firstMAX=0;
	     int secondMAX=0;
	     
	     int min=Integer.MIN_VALUE;
	     
	     for(int i=0;i<arr.length;i++)
	     {
	    	 if(arr[i] > firstMAX)
	    	 {
	    		 secondMAX=firstMAX;
	    		 firstMAX=arr[i];
	    	 }
	    	 else if(arr[i]!=firstMAX && arr[i] > min) 
	    	 {
	    		min=arr[i];
	    		 secondMAX=arr[i]; 
	    	 }
	     }
	     System.out.println("MAX Element :"+firstMAX);
	     System.out.println("MAX 2nd Element :"+secondMAX);
	     
	} 
}
