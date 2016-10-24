package Practical4;
import javax.swing.JOptionPane;
public class IntToString {
		 public static void main(String[] args){
		
		boolean goodInput = false;
		do{
			
		try{
		 String numberAsString = JOptionPane.showInputDialog(null,
		 "Enter an integer");
		 // Attempt to convert the String to an Int
			 int number = Integer.parseInt(numberAsString);
			 System.out.println("Conversion was successful!\n" +
			 "The integer entered is " + number);
			 goodInput = true;
		}
	    catch(NumberFormatException nFE){
	    	JOptionPane.showMessageDialog(null, "An Integer is required");

	    //}
		//catch(Exception e){
		//	System.out.println("An error has occoured");
		}
		
		}while(!goodInput);
		 
		}
}
