package lyit;
//@SuppressWarnings("resource")
//import java.util.*;
public class JointTester {

	public static void main(String[] args) {
		
		// Create a Joint object called homerAndMargesJointAccount
		Joint homerAndMargesJointAccount = new Joint(new Name("Mr", "Homer", "Sinpson"), new Name("Ms", "Marge", "Simpson"), new Address("747", "Evegreen", "Springfield", "Nyc"), 5500.00,new Date(1,2,3));
								
		// display homerAndMargesJointAccount's details on screen
		System.out.println(homerAndMargesJointAccount);
						
		// Create a Joint object called lisaAndBartssJointAccount with initial values
		Joint lisaAndBartssJointAccount = new Joint(new Name("Mr", "Bart", "Sinpson"), new Name("Ms", "Lisa", "Simpson"), new Address("747", "Evegreen", "Springfield", "Nyc"), 1500.00,new Date(1,2,3));
								
		// display lisaAndBartssJointAccount's details on screen
		System.out.println(lisaAndBartssJointAccount);
								
		// change lisaAndBartssJointAccount's firstName to "Lisa-Marie"
		lisaAndBartssJointAccount.getNameTwo().setFirstName("Lisa-Marie");
						
		// display lisaAndBartssJointAccount's details on screen
		System.out.println(lisaAndBartssJointAccount);
						
		// check if homerAndMargesJointAccount is the same as lisaAndBartssJointAccount
		if(homerAndMargesJointAccount.equals(lisaAndBartssJointAccount))
		   System.out.println(homerAndMargesJointAccount + " is the same account as " + lisaAndBartssJointAccount);
		else
		   System.out.println(homerAndMargesJointAccount + " is not the same account as " + lisaAndBartssJointAccount);
						
		// check if homerAndMargesJointAccount is female
		if(homerAndMargesJointAccount.getNameOne().isFemale() || homerAndMargesJointAccount.getNameTwo().isFemale())
		   System.out.println(homerAndMargesJointAccount + " has a female account holder.");			
		else
		   System.out.println(homerAndMargesJointAccount + " has no female account holder.");	
	   }
		

	}

