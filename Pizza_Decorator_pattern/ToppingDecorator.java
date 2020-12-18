package Pizza_Decorator_pattern;

public abstract class ToppingDecorator implements Pizza{

	protected Pizza newPizza;

	public ToppingDecorator(Pizza newPizza) {
		this.newPizza = newPizza;
	}
	
	public String getDescription() {
		return newPizza.getDescription();
	}
	
	public double getCost() {
		return newPizza.getCost();	
	}
	
}
