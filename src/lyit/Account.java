package lyit;

	public abstract class Account {

		
		protected static int startingNumber = 1;
		protected int accountNumber;
		protected double balance;
		
		public Account(){
			accountNumber = startingNumber;
			startingNumber++;
			balance = 0;
		}
		
		
		public abstract void createAccountNumber();

		
		public double getBalance() {
			return balance;
		}

		
		public abstract void deposit(double amount);
		
		public abstract double withdraw(double amount);
		
	}
