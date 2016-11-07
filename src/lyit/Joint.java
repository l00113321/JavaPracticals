package lyit;


import java.util.Scanner;

public class Joint extends Account {

	
	private Name nameOne;
	private Name nameTwo;
	private Address address;
	private Date dateOpened;

	public Joint() {
		this(null, null, null, 0, null);
	}

	
	public Joint(Name nameOne, Name nameTwo, Address address, double balance, Date dateOpened) {
		this.nameOne = nameOne;
		this.nameTwo = nameTwo;
		this.address = address;
		this.balance = balance;
		this.dateOpened = dateOpened;
	}
	
	public void read(){
		@SuppressWarnings("resource")
		Scanner keyIn = new Scanner(System.in);

		System.out.print("Please Enter Name Ones Details:");
		System.out.print("Please Enter Name Ones Title:");
		this.nameOne.setTitle(keyIn.nextLine());
		System.out.print("Please Enter Name Ones First Name:");
		this.nameOne.setFirstName(keyIn.nextLine());
		System.out.print("Please Enter Name Ones Surname:");
		this.nameOne.setLastName(keyIn.nextLine());
		
		System.out.print("Please Enter Name Twos Title:");
		System.out.print("Please Enter Name Twos Title:");
		this.nameTwo.setTitle(keyIn.nextLine());
		System.out.print("Please Enter Name Twos First Name:");
		this.nameTwo.setFirstName(keyIn.nextLine());
		System.out.print("Please Enter Name Twos Surname:");
		this.nameTwo.setLastName(keyIn.nextLine());
	}

	
	public Name getNameOne() {

		return nameOne;
	}

	
	public void setNameOne(Name nameOne) {

		this.nameOne = nameOne;
	}

	
	public Name getNameTwo() {

		return nameTwo;
	}

	
	public void setNameTwo(Name nameTwo) {

		this.nameTwo = nameTwo;
	}

	
	public Address getAddress() {

		return address;
	}

	
	public void setAddress(Address address) {

		this.address = address;
	}

	
	public int getAccountNumber() {

		return this.accountNumber;
	}

	@Override
	public void createAccountNumber() {

		this.accountNumber = Account.startingNumber++;
	}

	@Override
	public void deposit(double amount) {

		balance += amount;
	}

	@Override
	public double withdraw(double amount) {

		if (balance <= 0) {

			return 0;
		} else if (amount > balance) {
			return 0;
		} else {

			balance -= amount;
			return amount;
		}
	}

	
	public Date getDateOpened() {

		return dateOpened;
	}

	
	public void setDateOpened(Date dateOpened) {

		this.dateOpened = dateOpened;
	}

	public boolean equal(Joint account) {

		return account.nameOne.equals(nameOne) && account.nameTwo.equals(nameTwo) && account.address.equals(address) && account.dateOpened.equals(dateOpened);
	}

	
	@Override
	public String toString() {

		return "nameOne=" + nameOne + ", nameTwo=" + nameTwo +" "+ address + ", accountNumber=" + accountNumber + ", balance=" + balance + ", dateOpened=" + dateOpened;
	}

}