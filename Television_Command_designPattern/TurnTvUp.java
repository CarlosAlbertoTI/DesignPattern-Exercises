package Television_Command_designPattern;

public class TurnTvUp implements Command{
	
	ElectronicDevice theDevice;
	
	
	public TurnTvUp(ElectronicDevice newDevice) {
		this.theDevice = newDevice;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		theDevice.volumeUp();
	}
	
	 public void undo() {
		 
		          
		 
		         theDevice.volumeDown();
		 
		          
		 
		     }


}
