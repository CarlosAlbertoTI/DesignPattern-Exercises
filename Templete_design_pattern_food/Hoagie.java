package Templete_design_pattern_food;

public abstract class Hoagie {
	
	final void makeSandwish() {
		
		cutBun();
		
		if(custumerWantsMeat()) {
			addMeat();
		}
		
		if(custumerWantsCheese()) {
			addCheese();
		}
		
		if(custumerWantsVegetables()) {
			addVegetables();
		}
		
		if(custumerWantsCondiments()) {
			addCondiments();
		}

		wrapTheHoagie();
	}
	
	
	public void cutBun() {
		System.out.println("The Hoagie is cut!");
	}
	
	abstract void addMeat();
	abstract void addCheese();
	abstract void addVegetables();
	abstract void addCondiments();
	
	boolean custumerWantsMeat() { return true; }
	boolean custumerWantsCheese()  { return true; }
	boolean custumerWantsVegetables()  { return true; }
	boolean custumerWantsCondiments ()  { return true; }
	
	public void wrapTheHoagie() {
		System.out.println("Wrap the Hoagie!");
	}
}
