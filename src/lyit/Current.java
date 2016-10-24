package lyit;

public class Current extends Account {

	private double overdraftAmount;

	public Current() {
		super();
		overdraftAmount = 0.0;
	}

	public Current(String t, String fN, String sn, String addressIn, double balanceIn, int dayIn, int monthIn,
			int yearIn, double overdraftAmountIn) {
		super(t, fN, sn, addressIn, balanceIn, dayIn, monthIn, yearIn);
		overdraftAmount = overdraftAmountIn;
	}

	@Override
	public String toString() {
		return (super.toString() + ",Overdraft Available is " + overdraftAmount);
	}

	public double getOverdraftAmount() {
		return overdraftAmount;
	}

	public void setOverdraftAmount(double overdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}

	public boolean overdrawn() {
		return (balance < 0.0);
	}

}
