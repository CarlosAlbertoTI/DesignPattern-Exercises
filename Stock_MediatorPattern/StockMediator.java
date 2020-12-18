package Stock_MediatorPattern;

import java.util.ArrayList;

public class StockMediator implements Mediator{
	
	private ArrayList<Colleague> colleague;
	private ArrayList<StockOffer> stockBuyOffers;
	private ArrayList<StockOffer> stockSellOffers;
	
	
	private int colleagueCodes = 0;
	
	public StockMediator() {
		colleague = new ArrayList<Colleague>();
		stockBuyOffers = new ArrayList<StockOffer>();
		stockSellOffers = new ArrayList<StockOffer>();
	}

	@Override
	public void addColleague(Colleague newColleague) {
		// TODO Auto-generated method stub
		colleague.add(newColleague);
		colleagueCodes++;
		newColleague.setCollCode(colleagueCodes );
	}
	
	public void saleOffer(String stock, int shares, int collCode) {

		boolean stockSold = false;
		
		for(StockOffer offer: stockBuyOffers){
			
			if((offer.getStock() == stock) && (offer.getStockShares() == shares)){
				
				System.out.println(shares + " shares of " + stock + 
						" sold to colleague code " + offer.getCollCode());
				
				stockBuyOffers.remove(offer);
				
				stockSold = true;
				
			} 
			
			if(stockSold){ break; }
			
		}
		
		if(!stockSold) {
			
			System.out.println(shares + " shares of " + stock + 
					" added to inventory");
			
			StockOffer newOffering = new StockOffer(shares, stock, collCode);
			
			stockSellOffers.add(newOffering);
			
		}
	
	}

	public void buyOffer(String stock, int shares, int collCode) {
		
		boolean stockBought = false;
		
		for(StockOffer offer: stockSellOffers){
			
			if((offer.getStock() == stock) && (offer.getStockShares() == shares)){
				
				System.out.println(shares + " shares of " + stock + 
						" bought by colleague code " + offer.getCollCode());
				
				stockSellOffers.remove(offer);
				
				stockBought = true;
				
			} 
			
			if(stockBought){ break; }
			
		}
		
		if(!stockBought) {
			
			System.out.println(shares + " shares of " + stock + 
					" added to inventory");
			
			StockOffer newOffering = new StockOffer(shares, stock, collCode);
			
			stockBuyOffers.add(newOffering);
			
		}
		
	}
	
	public void getstockOfferings(){
		
		System.out.println("\nStocks for Sale");
		
		for(StockOffer offer: stockSellOffers){
			
			System.out.println(offer.getStockShares() + " of " + offer.getStock());
			
		}
		
		System.out.println("\nStock Buy Offers");
		
		for(StockOffer offer: stockBuyOffers){
			
			System.out.println(offer.getStockShares() + " of " + offer.getStock());
			
		}
		
	}
}
