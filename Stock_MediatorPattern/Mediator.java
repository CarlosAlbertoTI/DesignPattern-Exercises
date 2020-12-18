 package Stock_MediatorPattern;

public interface Mediator {

	public void saleOffer(String stock, int shares, int collCode);
	public void buyOffer(String sotck, int shares, int collCode);
	public void addColleague(Colleague newColleague);
}
