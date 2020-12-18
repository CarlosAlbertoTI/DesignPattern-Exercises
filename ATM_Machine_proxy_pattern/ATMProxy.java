package ATM_Machine_proxy_pattern;

public class ATMProxy implements GetATMData{

	@Override
	public ATMState getATMData() {
		
		ATMMachine realATMMachine = new ATMMachine();
		return realATMMachine.getATMData();
}

	@Override
	public int getCashInMachine() {
				
		ATMMachine realAtmMachine = new ATMMachine();
		
		return realAtmMachine.getCashInMachine(); 
	}

}
