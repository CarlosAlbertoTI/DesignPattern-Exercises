package Television_Command_designPattern;

public class TurnOnTV implements Command{

	ElectronicDevice theDevice;
	
	public TurnOnTV(ElectronicDevice newDevice) {
		this.theDevice = newDevice;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		theDevice.on(); 
	}

	 public void undo() {
		 
		          
		
		         theDevice.off();
		
		          
		
		     }

}
