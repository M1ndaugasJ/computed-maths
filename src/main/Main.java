package main;

public class Main {

	private static final int MAX_ITERATION_VALUE = 100;
	
	public static void main(String[] args) {
		NewtonRaphson newtonRaphson = new NewtonRaphson();
		newtonRaphson.doNewtonRaphson();
		FixedIteration fixedIteration = new FixedIteration();
		fixedIteration.doFixedIteration();
	}

	public static int getMaxIterationValue() {
		return MAX_ITERATION_VALUE;
	}

}
