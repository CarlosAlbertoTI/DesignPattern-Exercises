package Animals_Strategy_designPattern;

public class Bird extends Animal{

	public Bird() {
		super();
		// TODO Auto-generated constructor stub
		setSound("Tweet ");
		typeOFly = new ItFlys();
	}	
	
}
