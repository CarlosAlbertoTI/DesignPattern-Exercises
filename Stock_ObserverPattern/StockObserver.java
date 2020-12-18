package Stock_ObserverPattern;

public class StockObserver implements Observer {

	private double ibmPrice;
	private double aaplPrice;
	private double googlPrice;

	private static int observerIDTracker = 0;

	private int observerID;

	private Subject stockGrabber;

	
	
	public StockObserver(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
		
		this.observerID = ++observerIDTracker;
		
		System.out.println("New observer "+this.observerID);
		
		stockGrabber.register(this);
	}



	@Override
	public void update(double ibmPrice, double aaplPrice, double googlPrice) {
		// TODO Auto-generated method stub

		this.aaplPrice = aaplPrice;
		this.ibmPrice = ibmPrice;
		this.googlPrice = googlPrice;
		
		printThePrices();
	}

	
	public void printThePrices() {
		System.out.println(observerID+" \nIBM: "+ibmPrice+"\nApple: "+aaplPrice+"\nGoogle: "+googlPrice);
	}
}
