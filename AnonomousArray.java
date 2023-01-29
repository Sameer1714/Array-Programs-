package home;

public class AnonomousArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnonomousArray.sum(new int[] {10,20,30});
		AnonomousArray.add(new int[][] {{10,20},{30,40}});
	}
    static void sum(int[] arr) {
    	int total=0;
    	
    	for(int i:arr) {
    		total+=i;
    	}
    	System.out.println("sum of 1D array element :"+total);
    }
    
    static void add(int[][] arr1) {
    	
    	int total=0;
    	
    	for(int ii[]:arr1) {
    		for(int i:ii) {
    			total+=i;
    		}
    	}
    	System.out.println("sum of 2D array element :"+total);
    }
}
