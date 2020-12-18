package TestBankAccount_Facate_Pattern;

public class BankAccountFacade {

	private int accountNumber;
	private int securityCode;
	
	AccountNumberCheck acctAccountNumberCheck;
	SecurityCodeCheck securityCodeCheck;
	FundsCheck fundsCheck;
	
	WelcomeToBank backWelcomeToBank;
	
	public BankAccountFacade(int newAccountNumber, int newSecurityCode) {
		this.accountNumber = newAccountNumber;
		this.securityCode = newSecurityCode;
		
		
		backWelcomeToBank = new WelcomeToBank();
		acctAccountNumberCheck =  new AccountNumberCheck();
		securityCodeCheck = new SecurityCodeCheck();
		fundsCheck  =  new FundsCheck();
 		
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public int getSecurityCode() {
		return securityCode;
	}
	
	public void withdrawCash(double cashToGet) {
		
		if(acctAccountNumberCheck.accountActivated(getAccountNumber()) && securityCodeCheck.isCodeCorrect(securityCode) && fundsCheck.haveEnoughMoney(cashToGet)) {
			System.out.println("Transation Complete!\n");
		}else {
			System.out.println("Transation Failed!\n");
		}
	}
	
	public void depositCash(double cashToDeposit) {

		if(acctAccountNumberCheck.accountActivated(getAccountNumber()) && securityCodeCheck.isCodeCorrect(securityCode)) {
			fundsCheck.makeDeposit(cashToDeposit);
			System.out.println("Transation Complete!\n");
		}else {
			System.out.println("Transation Failed!\n");
		}
	}
}
