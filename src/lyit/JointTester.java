package lyit;
import java.util.*;
public class JointTester {

	public static void main(String[] args) {
		
		// Create a Joint object called homerAndMargesJointAccount
		Joint homerAndMargesJointAccount = new Joint("Mr", "Homer", "Simpson", "Mrs", "Marge", "Simpson", "Springfield, NYC", 5500.00, 25, 10, 1965);
								
		// display homerAndMargesJointAccount's details on screen
		System.out.println(homerAndMargesJointAccount);
						
		// Create a Joint object called lisaAndBartssJointAccount with initial values
		Joint lisaAndBartssJointAccount = new Joint("Ms", "Lisa", "Simpson", "Mr", "Bart", "Simpson", "Springfield, NYC", 120.00, 20, 12, 1992);
								
		// display lisaAndBartssJointAccount's details on screen
		System.out.println(lisaAndBartssJointAccount);
								
		// change lisaAndBartssJointAccount's firstName to "Lisa-Marie"
		lisaAndBartssJointAccount.getName().setFirstName("Lisa-Marie");
						
		// display lisaAndBartssJointAccount's details on screen
		System.out.println(lisaAndBartssJointAccount);
						
		// check if homerAndMargesJointAccount is the same as lisaAndBartssJointAccount
		if(homerAndMargesJointAccount.equals(lisaAndBartssJointAccount))
		   System.out.println(homerAndMargesJointAccount + " is the same account as " + lisaAndBartssJointAccount);
		else
		   System.out.println(homerAndMargesJointAccount + " is not the same account as " + lisaAndBartssJointAccount);
						
		// check if homerAndMargesJointAccount is female
		if(homerAndMargesJointAccount.getName().isFemale() || homerAndMargesJointAccount.getNameB().isFemale())
		   System.out.println(homerAndMargesJointAccount + " has a female account holder.");			
		else
		   System.out.println(homerAndMargesJointAccount + " has no female account holder.");	
	   }
		

	}

