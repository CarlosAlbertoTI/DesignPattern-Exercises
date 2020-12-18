 package Television_Command_designPattern;

public class Television implements ElectronicDevice{
	
	private int volume = 0;

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("The TV is ON");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("The TV is OFF");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		volume++;
		System.out.println("The volume is at "+volume);
	}

	@Override
	public void volumeDown() {
		volume--;
		// TODO Auto-generated method stub
		System.out.println("The volume is at "+volume );
	}

}
