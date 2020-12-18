package TestBankAccount_Facate_Pattern;

public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccountFacade accessingBank = new BankAccountFacade(12345,55555);
		
		accessingBank.withdrawCash(50.00);
		
		accessingBank.withdrawCash(900.00);
		
		accessingBank.depositCash(100.00);
		
	}

}
