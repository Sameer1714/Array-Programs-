package home;

public class CalculateYear {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int day=419;
		
		int year=day/365;
		
		int x=day%365;
		
		int month=x/30;
		
		int day1=x%30;
		
		int week=day1/7;
		
		int day2=day1%7;
		
		
		System.out.println("year:"+year+" month: "+month+" week :"+week+" day: "+day2);
	}

}
