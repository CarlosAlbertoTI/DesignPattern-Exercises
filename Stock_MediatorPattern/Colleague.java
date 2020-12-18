 package Stock_MediatorPattern;

public abstract class Colleague {
	
	
	private Mediator mediator;
	private int colleagueCode;
	
	public Colleague(Mediator newMediator) {
		mediator = newMediator;
	}
	
	public void salesOffer(String stock, int shares) {
		mediator.saleOffer(stock, shares, this.colleagueCode);
	}
	
	public void buyOffer(String stock, int shares) {
		mediator.buyOffer(stock, shares, this.colleagueCode);
	}
	
	
	public void setCollCode(int newCollCode) { colleagueCode = newCollCode; } 

}
