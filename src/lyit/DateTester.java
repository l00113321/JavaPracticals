package lyit;
import java.util.*;
public class DateTester {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		Date d1 = new Date();
		//Date d2 = new Date(2, 3, 2001);
		int setDayTo = 32, setMonthTo = 13, setYearTo = 1899;
		boolean goodInput = false;
	      System.out.println(d1);  
	      do{
				try{
					d1.setDay(setDayTo);
					d1.setMonth(setMonthTo);
					d1.setYear(setYearTo);
					goodInput=true;
				}
				catch(IllegalArgumentException iEA){
					System.out.println("Incorrect day, month or year.");
					
					System.out.print("RE-ENTER VALID ARGUMENT FOR Day:");
					setDayTo = keyboard.nextInt();
					System.out.print("RE-ENTER VALID ARGUMENT FOR Month:");
					setMonthTo = keyboard.nextInt();
					System.out.print("RE-ENTER VALID ARGUMENT FOR Year:");
					setYearTo = keyboard.nextInt();				
				}
				catch(Exception e){
					System.out.println("An Error Occurred.");
				}
			}while(!goodInput);	
	  
	        System.out.println(d1);
			Date d2 = new Date(28, 12, 1982);
	
	     System.out.println(d2);
	      
			if(d1.equals(d2))
				System.out.println("Date's are equal.");
			else
				System.out.println("Date's are not equal.");
	         
	       //Further testing of methods as required...
	}
}


