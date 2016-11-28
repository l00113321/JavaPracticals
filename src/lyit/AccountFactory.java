package lyit;

public class AccountFactory {

	public Account getAccount(String accType) {
		if (accType == null) {
			return null;
		}
		if (accType.equalsIgnoreCase("JOINT")) {
			return new Joint();
		} else if (accType.equalsIgnoreCase("CURRENT")) {
			return new Current();
		}
		return null;
	}
}
