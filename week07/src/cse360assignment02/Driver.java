package cse360assignment02;

public class Driver {

	public static void main(String[] args) {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		System.out.println(myCalculator + " = " + myCalculator.getTotal());
	}

}
