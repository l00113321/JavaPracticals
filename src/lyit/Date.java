package lyit;
import java.io.Serializable;
import java.util.Scanner;

public class Date  implements Serializable{
		
		private int day;
		private int month;
		private int year;
		
		private static final long serialVersionUID = 1L;
		public Date(){
			day=month=year=0;
		}

		public Date(int day, int month, int year) {
			super();
			this.day = day;
			this.month = month;
			this.year = year;
		}
		
		public void read(){
			@SuppressWarnings("resource")
			Scanner kbString = new Scanner(System.in);
			System.out.println("Please Eeter Date Details :");
			
			System.out.println("Day :");
			this.day = kbString.nextInt();
			System.out.println("Month :");
			this.month = kbString.nextInt();
			System.out.println("Year :");
			this.year = kbString.nextInt();
		}

		@Override
		public String toString() {
			return  " "+day + "/" + month + "/" + year;
		}
		
		public boolean equals(Date d){			
			   return( day == d.day &&
		              month == d.month &&
		              year == d.year);
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			if(day > 31 || day < 1){
			throw new IllegalArgumentException("DAY IS OUT OF THE 1 TO 31 RANGE"); 
			}
			else{
			this.day = day;
			}
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			if(month > 12 || month < 1){
				throw new IllegalArgumentException("MONTH IS OUT OF THE 1 TO 12 RANGE"); 
			}
			else{
			this.month = month;
			}
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			if (year < 1900){
				throw new IllegalArgumentException("YEAR IS BELOW THE 1900 RANGE"); 
			}
			else{
			this.year = year;
			}
		}
}
