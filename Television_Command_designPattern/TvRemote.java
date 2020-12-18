 package Television_Command_designPattern;

public class TvRemote {

	public static ElectronicDevice getDevice() {
		return new Television(); 
	}
}
