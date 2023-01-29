package home;

public class StackArrayProgram 
{
	static int[] arr=new int[5];
	static int ind=0;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		push(30);
		push(40);
		push(50);
		push(70);
		push(90);
		print();
		System.out.println("pop : "+pop());
		System.out.println("pop : "+pop());
		System.out.println("\nRemining element in Stack :");
		print();

	}
	public static int pop() {
		// TODO Auto-generated method stub
		ind--;
		return arr[ind];
	}
	public static void print() {
		// TODO Auto-generated method stub
		for(int i=ind-1;i>=0;i--) {
			System.out.println(arr[i]+" ");
		}
	}
	public static void push(int i) {
		// TODO Auto-generated method stub
		if(ind< arr.length) {
			arr[ind]=i;
			ind++;
		}
	}

}
