package Television_Command_designPattern;

public class TurnTvDown implements Command{
	
	ElectronicDevice theDevice;
	
	
	public TurnTvDown(ElectronicDevice newDevice) {
		this.theDevice = newDevice;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		theDevice.volumeDown();
	}
	
	 public void undo() {
		 
		          
		 
		         theDevice.volumeUp();
		 
		          
		 
		     }


}



