/*
  leap year means the year contains 366 days.
  leap year comes after 4 years.
  after four years one day will added
  if its totally divide by 4, 100, 400 then it is leap year  
*/
class Day1Problem7 {
	public static void main(String []args) {
		int Year=2012;
		if( Year%4==0 )
		{
				System.out.println("This is leap year");
		}
		else
		{		
				System.out.println("This year is not leap year");
		}
		
	}
	
}	
	