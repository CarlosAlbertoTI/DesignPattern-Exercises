package ChainOfResponsibility_design_pattern_Chain;

public class Numbers {
	int numberOne;
	int numberTwo;
	
	String calculationTypeString;

	public Numbers(int numberOne, int numberTwo, String calculationTypeString) {
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
		this.calculationTypeString = calculationTypeString;
	}

	public int getNumberOne() {
		return numberOne;
	}

	public void setNumberOne(int numberOne) {
		this.numberOne = numberOne;
	}

	public int getNumberTwo() {
		return numberTwo;
	}

	public void setNumberTwo(int numberTwo) {
		this.numberTwo = numberTwo;
	}

	public String getCalculationTypeString() {
		return calculationTypeString;
	}

	public void setCalculationTypeString(String calculationTypeString) {
		this.calculationTypeString = calculationTypeString;
	}
	
}
