package TestBankAccount_Facate_Pattern;

public class FundsCheck {
	
	private double cashInAccount = 1000.00;
	
	public double getCashInAccount() {
		return cashInAccount;
	}
	
	public void decreaseCashInAccount(double cashWithdrawn) {
		cashInAccount -= cashWithdrawn;
	}
	
	public void increaseCashInAccount(double cashDeposited) {
		cashInAccount += cashDeposited;
	}
	
	public boolean haveEnoughMoney(double cashToWithdrawal) {
		
		if(cashToWithdrawal > getCashInAccount()) {
			System.out.println("Sorry, oyou don't have enough money!");
			System.out.println("Your current balance is : "+getCashInAccount());
			
			return false;
		}else {
			
			decreaseCashInAccount(cashToWithdrawal);
			System.out.println("Withdrawal Complete: Current balance is "+getCashInAccount());
			return true;
		}
	}
	
	public void makeDeposit(double cashToDeposit) {
		increaseCashInAccount(cashToDeposit);
		System.out.println("Deposit Completed: Current Balance is "+getCashInAccount());
	}

}
