package TestBankAccount_Facate_Pattern;

public class SecurityCodeCheck {
	
	private int securityCode = 55555;
	
	public int getSecurityCode() {
		return securityCode;
	}
	
	public boolean isCodeCorrect(int secCodeToCheck) {
		if(secCodeToCheck == getSecurityCode()) {
			return true;
		}else {
			return false;
		}
	}
}
