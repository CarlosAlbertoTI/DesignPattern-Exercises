package ChainOfResponsibility_design_pattern_Chain;

public class SubChainCalculation implements Chain{

	private Chain nextInChain;
	
	public void setNextChain(Chain theNewNextChain) {
		
		nextInChain = theNewNextChain;
		
	}

		
	public void calculate(Numbers request) {
		
		if(request.getCalculationTypeString() == "sub"){
			
			System.out.print(request.getNumberOne() + " - " + request.getNumberTwo() + " = "+
					(request.getNumberOne()-request.getNumberTwo()));
			
		} else {
			
			nextInChain.calculate(request);
			
			
		}
		
	}


}
