package ChainOfResponsibility_design_pattern_Chain;

public class TestChainCalc {
	
	public static void main(String[] args){
		
		// Here I define all of the objects in the chain
		
		Chain chainCalc1 = new AddChainCalculation();
		Chain chainCalc2 = new SubChainCalculation();
		Chain chainCalc4 = new MultChainCalculation();
		Chain chainCalc3 = new DivChainCalculation();
		
		// Here I tell each object where to forward the
		// data if it can't process the request
		
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		
		// Define the data in the Numbers Object
		// and send it to the first Object in the chain
		
		Numbers request = new Numbers(4,2,"div");
		
		chainCalc1.calculate(request);
		
	}

}