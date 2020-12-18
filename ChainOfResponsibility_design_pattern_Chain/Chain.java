package ChainOfResponsibility_design_pattern_Chain;

public interface Chain {
	
	public void setNextChain(Chain theNewNextChain);
	public void calculate(Numbers request);
}
