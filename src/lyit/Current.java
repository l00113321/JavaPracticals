//Dermot McGee l00113321

package lyit;

public class Current extends Account {
	private Name name;
	private Address address;
	private int accountNumber;
	private Date dateOpened;
	private double overdraftSet;
	private double overdraft;

	public Current() {
		this(null, null, 0, 0, null);
		createAccountNumber();
	}

	public Current(Name name, Address address, double balance, double overdraft, Date dateOpened) {
		this.name = name;
		this.address = address;
		this.balance = balance;
		this.overdraft = overdraft;
		this.dateOpened = dateOpened;
		createAccountNumber();

		overdraftSet = overdraft;
	}

	public Name getName() {

		return name;
	}

	public void setName(Name name) {

		this.name = name;
	}

	public Address getAddress() {

		return address;
	}

	public void setAddress(Address address) {

		this.address = address;
	}

	@Override
	public void createAccountNumber() {

		this.accountNumber = Account.startingNumber++;
	}

	@Override
	public void deposit(double amount) {

		double fixOverdraft = overdraftSet - overdraft;

		System.out.printf("%f overdraft remaining \n", fixOverdraft);

		if (balance == 0) {

			if (amount > fixOverdraft) {

				amount -= fixOverdraft;

				System.out.printf("%f remaining amount \n", amount);

				overdraft = overdraftSet;

				System.out.printf("%f overdraft \n", overdraft);

				balance = amount;

				System.out.printf("%f balance \n", balance);

			} else {

				overdraft += amount;
			}

		} else if (balance > 0) {

			balance += amount;
		}
	}

	@Override
	public double withdraw(double amount) {

		double withdraw = amount;

		if (balance <= 0 && overdraft <= 0) {

			return 0;
		} else if (balance <= 0 && amount > overdraft) {

			return 0;
		} else if (amount > (balance + overdraftSet)) {

			return 0;

		} else if (balance <= 0 && amount < overdraft) {

			overdraft -= withdraw;
			return amount;

		} else if (balance > 0) {

			if (amount > balance) {

				withdraw -= balance;
				balance = 0;
				overdraft -= withdraw;
				return amount;

			}

			balance -= withdraw;
			return amount;
		}

		return 0;
	}

	public int getAccountNumber() {

		return this.accountNumber;
	}

	public Date getDateOpened() {

		return dateOpened;
	}

	public double getOverdraft() {

		return overdraft;
	}

	public void setOverdraft(double overdraft) {

		this.overdraft = overdraft;
	}

	public boolean equal(Current account) {

		return account.name.equals(name) && account.address.equals(address) && account.dateOpened.equals(dateOpened);
	}

	@Override
	public String toString() {

		return "Current [name=" + name + ", address=" + address + ", accountNumber=" + accountNumber + ", dateOpened="
				+ dateOpened + ", balance=" + balance + ", overdraft=" + overdraft + "]";
	}

}
