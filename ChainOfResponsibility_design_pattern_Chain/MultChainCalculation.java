package ChainOfResponsibility_design_pattern_Chain;

public class MultChainCalculation implements Chain{


	
	public void setNextChain(Chain theNewNextChain) {}

		
	public void calculate(Numbers request) {
		
		if(request.getCalculationTypeString() == "mult"){
			
			System.out.print(request.getNumberOne() + " * " + request.getNumberTwo() + " = "+
					(request.getNumberOne()*request.getNumberTwo()));
			
		} else {
			
			System.out.println("We can only operate with add, sub, div and mult");
			
			
		}
		
	}

}
