package lyit;

import java.io.Serializable;
import java.util.Scanner;


public class Joint extends Account implements Serializable{

	private Name nameOne;
	private Name nameTwo;
	private Address address;
	private Date dateOpened;

	private static final long serialVersionUID = 1L;
	public Joint() {
		this(null, null, null, 0, null);
	}

	public Joint(Name nameOne, Name nameTwo, Address address, double balance, Date dateOpened) {
		this.nameOne = nameOne;
		this.nameTwo = nameTwo;
		this.address = address;
		this.balance = balance;
		this.dateOpened = dateOpened;
		//createAccountNumber();
	}

	public void read(){
		@SuppressWarnings("resource")
		Scanner kbString = new Scanner(System.in);
		String t1, fn1, ln1, t2, fn2, ln2, number, street, town, county;
		int day, month, year;
		Name name1 = new Name();
		Name name2 = new Name();
		Address address = new Address();
		Date d1 = new Date();
		
		System.out.println("Please Enter Cumtomer 1's Details :");
		
		System.out.println("Title :");
		t1=kbString.nextLine();
		name1.setTitle(t1);
		System.out.println("First Name :");
		fn1=kbString.nextLine();
		name1.setFirstName(fn1);
		System.out.println("Surname :");
		ln1=kbString.nextLine();
		name1.setLastName(ln1);
		this.setNameOne(name1);
		
		System.out.println("Please Enter Cumtomer 2's Details :");
		
		System.out.println("Title :");
		t2=kbString.nextLine();
		name2.setTitle(t2);
		System.out.println("First Name :");
		fn2=kbString.nextLine();
		name2.setFirstName(fn2);
		System.out.println("Surname :");
		ln2=kbString.nextLine();
		name2.setLastName(ln2);
		this.setNameTwo(name2);
		
		System.out.println("Please Enter Address :");
		
		System.out.println("Name :");
		number=kbString.nextLine();
		address.setName(number);
		System.out.println("Street :");
		street=kbString.nextLine();
		address.setStreet(street);
		System.out.println("Town :");
		town=kbString.nextLine();
		address.setTown(town);
		System.out.println("County :");
		county=kbString.nextLine();
		address.setCounty(county);
		this.setAddress(address);
		
		System.out.println("Please Enter The Balance :");
		balance = kbString.nextDouble();
		
		System.out.println("Please Enter The Date opened :");
		System.out.println("Day :");
		day = kbString.nextInt();
		d1.setDay(day);
		
		System.out.println("Month :");
		month = kbString.nextInt();
		d1.setMonth(month);
		
		System.out.println("Year :");
		year = kbString.nextInt();
		d1.setYear(year);
		this.setDateOpened(d1);
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

		return account.nameOne.equals(nameOne) && account.nameTwo.equals(nameTwo) && account.address.equals(address)
				&& account.dateOpened.equals(dateOpened);
	}
	
	
	//@Override
	public String toString() {
		return "Joint Account Number "  + accountNumber +" : " +" Account Holder 1 =" + " "+nameOne+" "+", Account Holder 2 = " + nameTwo+" "+", " + address + ", Opened on ="
				+ dateOpened +  ", Balance =" + balance + "]";
		
	}

	

}