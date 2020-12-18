package Animals_Strategy_designPattern;

public class AnimalPlay {
	public static void main(String[] args) {
	
		Animal spark = new Dog();
		Animal tweet = new Bird();
		
		
		System.out.println("Dog: "+ spark.tryToFly());
		System.out.println("Bird: "+tweet.tryToFly());
		
		
		spark.setTryToFly(new ItFlys());
		
		System.out.println("Dog: "+ spark.tryToFly());
	}
}
