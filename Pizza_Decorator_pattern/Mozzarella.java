package Pizza_Decorator_pattern;

public class Mozzarella extends ToppingDecorator{

	public Mozzarella(Pizza newPizza) {
	 	super(newPizza);
		// TODO Auto-generated constructor stub
	 	
	 	System.out.println("Adding Dough");
	 	
	 	System.out.println("Adding Moz");
	}

	public String getDescription() {
		return newPizza.getDescription()+ ", Mozzarella";
	}
	
	public double getCost() {
		return newPizza.getCost()+ 0.50;	
	}
}
