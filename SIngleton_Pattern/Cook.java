package SIngleton_Pattern;

public class Cook {
	private static Cook cook = null;
	
	private Cook() {}
	
	public static Cook cookSingletonGetInstance() {
		if(cook == null) {
			cook = new Cook();
			return cook;
		}else {
			System.out.println("You cannot cook, because someone is cooking at the moment");
			return cook;
		}
	}
	
	public void cooking() {
		System.out.println("Cooking food");
	}
	
}
