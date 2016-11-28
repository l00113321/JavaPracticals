package lyit;

public class AccountFactory {
	
	public Account getAccount(String accountType){
		if(accountType == null){
			return null;
		}
	
	if(accountType.equalsIgnoreCase("JOINT")){
		return new Joint();
	}
	else if(accountType.equalsIgnoreCase("CURRENT")){
		return new Current();
	}
	return null;
}
}
