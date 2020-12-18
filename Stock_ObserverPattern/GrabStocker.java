package Stock_ObserverPattern;

public class GrabStocker {

	public static void main(String[] args) {
		
		StrockGrabber stockGrabber = new StrockGrabber();
		
		StockObserver observer1 = new StockObserver(stockGrabber);
		
		stockGrabber.setAaplPrice(123.33);
		stockGrabber.setGooglPrice(400.12);
		stockGrabber.setIbmPrice(600.2123);
		
		StockObserver observer2 = new StockObserver(stockGrabber);
		
		stockGrabber.setAaplPrice(123.33);
		stockGrabber.setGooglPrice(400.12);
		stockGrabber.setIbmPrice(600.2123);
		
		stockGrabber.unregister(observer1);
		
		
		stockGrabber.setAaplPrice(123.33);
		stockGrabber.setGooglPrice(400.12);
		stockGrabber.setIbmPrice(600.2123);
		
	}
}
