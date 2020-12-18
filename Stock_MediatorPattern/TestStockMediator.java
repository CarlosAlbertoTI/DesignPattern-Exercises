package Stock_MediatorPattern;

public class TestStockMediator{
	
	public static void main(String[] args){
		
		StockMediator nyse = new StockMediator();
		
		GormanSlacks broker = new GormanSlacks(nyse);
		
		JTPoorman broker2 = new JTPoorman(nyse);
		
		broker.salesOffer("MSFT", 100);
		broker.salesOffer("GOOG", 50);
		
		broker2.buyOffer("MSFT", 100);
		broker2.salesOffer("NRG", 10);
		
		broker.buyOffer("NRG", 10);
		
		nyse.getstockOfferings();
		
	}
	
}