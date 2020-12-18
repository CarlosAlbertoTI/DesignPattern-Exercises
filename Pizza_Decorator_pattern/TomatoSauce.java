package Pizza_Decorator_pattern;

public class TomatoSauce extends ToppingDecorator{

	public TomatoSauce(Pizza newPizza) {
		super(newPizza);
	 	
	 	System.out.println("Adding Sauce");
	}

	public String getDescription() {
		return newPizza.getDescription()+ ", Tomato Sauce";
	}
	
	public double getCost() {
		return newPizza.getCost()+ 0.35;	
	}
}

