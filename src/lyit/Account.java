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
		

		public void setBalance(double s) {
			this.balance = s;
		}

		
		public abstract void deposit(double amount);
		
		public abstract double withdraw(double amount);
		
	}
