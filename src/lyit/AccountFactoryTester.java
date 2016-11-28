package lyit;
import java.util.*;
public class AccountFactoryTester {
	public static void main(String[] args) {
		Scanner keyIn = new Scanner(System.in);
		AccountFactory accountFactory = new AccountFactory();
		
		  System.out.print("Enter the name of Account you wish to create : ");  
	      String accType = keyIn.nextLine();
	      Account account = accountFactory.getAccount(accType);
	      

		  System.out.print("Enter the name of Account you wish to create : ");  
	      String accType2 = keyIn.nextLine();
	      Account account2 = accountFactory.getAccount(accType2);
	      
	      account.read();
	      account2.read();
	     
	}
}
