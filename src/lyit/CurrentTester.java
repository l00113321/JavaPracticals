package lyit;
import java.util.*;
public class CurrentTester {

	public static void main(String[] args) {
		 // Create a Current object called homersCurrentAccount with initial values
		   Current homersCurrentAccount = new Current("Mr", "Homer", "Simpson", "Springfield, NYC", 5500.00, 25, 10, 1965, 1000.00);
									
		   // Create a Current object called lisasCurrentAccount with initial values
		   Current lisasCurrentAccount = new Current("Ms", "Lisa", "Simpson", "Springfield, NYC", 120.00, 20, 12, 1992, 50.00);
									
		   // display homersCurrentAccount's details on screen
		   System.out.println(homersCurrentAccount);

		   // display lisasCurrentAccount's details on screen
		   System.out.println(lisasCurrentAccount);
		   
		   // change lisasCurrentAccount's firstName to "Lisa-Marie"
		   lisasCurrentAccount.getName().setFirstName("Lisa-Marie");
						
		   // display lisasCurrentAccount's details on screen
		   System.out.println(lisasCurrentAccount);
						
		   // check if homersCurrentAccount is the same as lisasCurrentAccount
		   if(homersCurrentAccount.equals(lisasCurrentAccount))
		      System.out.println(homersCurrentAccount + " is the same account as " + lisasCurrentAccount);
		   else
		      System.out.println(homersCurrentAccount + " is not the same account as " + lisasCurrentAccount);
			
			// check if homersCurrentAccount is female
			if(homersCurrentAccount.getName().isFemale())	// OR	if(personA.isFemale()==true)
			   System.out.println(homersCurrentAccount + " is female.");			
			else
			   System.out.println(homersCurrentAccount + " is male.");	
								
			// Create an ArrayList of Current objects called currents
		    ArrayList<Current> currents = new ArrayList<Current>();
			// Add 4 Current objects to names
		    currents.add(new Current("Mrs", "Marge", "Simpson", "Springfield, NYC", 63000.00, 18, 12, 1968, 2000.00));
		    currents.add(new Current("Mr", "Bartly", "Simpson", "Springfield, NYC", -55.00, 10, 10, 1990, 100));
		    currents.add(homersCurrentAccount);
		    currents.add(lisasCurrentAccount);
			// trim the capacity of names to be names current size
	 		currents.trimToSize();	
								
			// print every element in currents
			System.out.println("\nArrayList contains ==>");
		    for(Current tempCurrent:currents)
	 	       System.out.println(tempCurrent);

			if(currentSearch(homersCurrentAccount, currents))
				System.out.print(homersCurrentAccount + " is in the list!");
			else
			   System.out.print(homersCurrentAccount + " is not in the list!");
		}

	    public static boolean currentSearch(Current currentToFind, ArrayList<Current> listOfCurrents){
		   return(listOfCurrents.contains(currentToFind));
	    }

	}

