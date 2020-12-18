package TestBankAccount_Facate_Pattern;

public class AccountNumberCheck {
	
	private int accountNumber = 12345;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public boolean accountActivated(int accountNumberToCheck) {
		if(accountNumberToCheck == getAccountNumber()) {
			return true;
		}else {
			return false;
		}
	}
}
