package SIngleton_Pattern;

public class Client {
	private String name;
	private int age;
	private boolean canCook;
	
	public Client(String name, int age) {
		this.name = name;
		this.age = age;
		this.canCook = age > 15;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isCanCook() {
		if(this.canCook == true) {
			Cook cook = Cook.cookSingletonGetInstance();
			cook.cooking();
			return canCook;
		}
		return this.canCook;
	
	
	}

}
