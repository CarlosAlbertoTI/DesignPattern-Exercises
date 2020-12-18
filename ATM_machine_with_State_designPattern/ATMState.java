package ATM_machine_with_State_designPattern;

public interface ATMState {

	
	void insertCard();
	void ejectCard();
	void insertPin(int  pinEntered);
	void requestCash(int cashToWithdraw);
}
