package Stock_ObserverPattern;

import java.util.ArrayList;

public class StrockGrabber implements Subject {

	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googlPrice;

	public StrockGrabber() {
		super();
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer newObserver) {
		// TODO Auto-generated method stub
		observers.add(newObserver);
	}

	@Override
	public void unregister(Observer deleteObserver) {
		// TODO Auto-generated method stub

		int observerIndex = observers.indexOf(deleteObserver);

		System.out.println("The Observer " + observerIndex + 1 + " deleted");

		observers.remove(observerIndex);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub

		for (Observer observer : observers) {
			observer.update(ibmPrice, aaplPrice, googlPrice);
		}

	}

	public double getIbmPrice() {
		return ibmPrice;
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	public double getAaplPrice() {
		return aaplPrice;
	}

	public void setAaplPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		notifyObserver();
	}

	public double getGooglPrice() {
		return googlPrice;
	}

	public void setGooglPrice(double googlPrice) {
		this.googlPrice = googlPrice;
		notifyObserver(); 
	}

}
