package home;

public class QueueUsingArray 
{
	static int[] arr=new int[5];
	static int ind=0;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		push(10);
		push(30);
		push(50);
		print();
		System.out.println("\nPOP : "+pop());
		System.out.print("\nRemaining Element in ");
		print();
		

	}

	private static int pop() {
		// TODO Auto-generated method stub
		if(ind==0) {
			System.out.println("Queue is Empty ");
			return 0;
		}
		else
		{
			
			int temp=arr[0];
			for(int i=1;i<ind;i++) {
				arr[i-1]=arr[i];
			}
			ind--;
			return temp;
		}
	}

	private static void print() {
		// TODO Auto-generated method stub
		System.out.println("QUEUE :");
		for(int i=0;i<ind;i++) {
			System.out.println(arr[i]);
		}
		
	}

	private static void push(int i) {
		// TODO Auto-generated method stub
		if(ind < arr.length) {
			arr[ind]=i;	
			ind++;
			}
	}

}
