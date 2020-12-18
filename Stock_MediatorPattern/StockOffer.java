package Stock_MediatorPattern;

public class StockOffer {
	
	private int stockShares = 0;
	private String stockSymbol = "";
	private int colleagueCode = 0;
	
	public StockOffer(int numOfShares, String stock, int collCode) {
		
		this.stockShares = numOfShares;
		this.stockSymbol = stock;
		this.colleagueCode = collCode;
	}

	public int getStockShares() {
		return stockShares;
	}

	public String getStock() {
		return stockSymbol;
	}

	public int getCollCode() {
		return colleagueCode;
	}
	
	
	

	

}
