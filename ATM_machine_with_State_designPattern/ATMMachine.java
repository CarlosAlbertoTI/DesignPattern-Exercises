 package ATM_machine_with_State_designPattern;

public class ATMMachine {
	
	ATMState hasCard;
	ATMState noCard;
	ATMState hasCorrectPin;
	ATMState atmOutOfMoney;
	
	ATMState atmState;
	
	int cashInMachine = 10000;
	
	boolean correctPinEntered = false;

	public ATMMachine() {
		this.hasCard = new HasCard(this);
		this.noCard = new NoCard(this);
		this.hasCorrectPin = new HasPin(this);
		this.atmOutOfMoney = new NoCash(this);
		
		atmState = noCard;
		
		if(cashInMachine < 0) {
			atmState = atmOutOfMoney;
		}
	}
	
	
	void setATMState(ATMState newAtmState) {
		atmState = newAtmState;
	}
	
	public void setCashInMachine(int newAmountOfCash) {
		cashInMachine = newAmountOfCash;
	}
	
	
	public void insertCard() {
		atmState.insertCard();
	}
	
	public void ejectCard() {
		atmState.ejectCard();
	}
	
	public void insertPIN(int pinEntered) {
		atmState.insertPin(pinEntered);
	}
	
	public void requestCash(int cashToWithdraw) {
		atmState.requestCash(cashToWithdraw);
	}
	
	 public ATMState getYesCardState() { return hasCard; }
	     public ATMState getNoCardState() { return noCard; }
	     public ATMState getHasPin() { return hasCorrectPin; }
	     public ATMState getNoCashState() { return atmOutOfMoney; }

}

