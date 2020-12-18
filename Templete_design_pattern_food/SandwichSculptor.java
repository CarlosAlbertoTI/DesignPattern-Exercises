package Templete_design_pattern_food;

public class SandwichSculptor {
	
	public static void main(String[] args){
		
		ItalianHoagie cust12Hoagie = new ItalianHoagie();
		
		cust12Hoagie.makeSandwish();
		
		System.out.println();
		
		VeggieHoagie cust13Hoagie = new VeggieHoagie();
		
		cust13Hoagie.makeSandwish();
		
	}
	
}