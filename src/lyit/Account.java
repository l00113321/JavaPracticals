package lyit;

public class Account {
		
		protected Name name;
		protected String address;
		protected double balance;
		protected Date dateOpened;
		protected int accountNo;
		
		private static int nextUniqueNumber = 1;
		
		public Account(){
			name = new Name();
			address = "";
			balance = 0.0;
			dateOpened = new Date();
			accountNo = nextUniqueNumber++;
		}

		public Account(String t, String fN, String lN, String address,
				double balance, int day, int month, int year){
			this.name = new Name(t, fN, lN);
			this.address = address;
			this.balance = balance;
			this.dateOpened = new Date(day, month, year);
			accountNo = nextUniqueNumber++;
		}

		@Override
		public String toString() {
			return "Account name =" + name + ", address =" + address + ", balance =" + balance + ", dateOpened ="
					+ dateOpened + ", accountNo=" + accountNo;
		}
		
		@Override
	 	public boolean equals(Object o){
			// First check if o is a null reference to prevent run-time exceptions
			if(o == null) 
	           return false;
		
			// Next check if o references the current object, if it does it must be equal
			if (this == o)
				return true;
	         
			// Next check if o is in fact an Account object
			if(!(o instanceof Account))
				return false;
			else
			{
			    // If none of the above are true, cast o to a Account object so that
	            // we can compare the object's instance variables and methods
				Account other = (Account)o;
				
				return (this.accountNo == other.accountNo);
			}
		}

		public Name getName() {
			return name;
		}

		public void setName(Name name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public Date getDateOpened() {
			return dateOpened;
		}

		public void setDateOpened(Date dateOpened) {
			this.dateOpened = dateOpened;
		}

		public int getAccountNo() {
			return accountNo;
		}		
}
