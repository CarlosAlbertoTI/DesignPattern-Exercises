package Television_Command_designPattern;

public class TurnOFFTv implements Command{

	ElectronicDevice theDevice;
	
	public TurnOFFTv(ElectronicDevice newDevice) {
		this.theDevice = newDevice;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		theDevice.off(); 
	}
	
	 public void undo() {
		
		          
		
		         theDevice.on();
		
		          
		
		     }


}
