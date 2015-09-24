package main;

public class NewtonRaphson extends Main {

	private final double precision = 1 * 1e-16;
	private Double[] array = new Double[getMaxIterationValue()] ;
	public void doNewtonRaphson(){
		System.out.println("Performing Newton-Raphson algorithm");
		double artinys = 2;
		for(int i = 0; i < getMaxIterationValue(); i++){
			array[i] = artinys - (funcToCalc(artinys)/findDerivative(artinys));
			System.out.println("Iteration: " + i + " result is " + array[i] + " the difference between last two iterations is " + (array[i] - artinys));
			artinys = array[i];
			if(i>0){
				if(Math.abs(array[i] - array[i-1]) < precision){
					System.out.println("Sprendinys: " + array[i]);
					break;
				}
			}
		}
	}
	
	private double findDerivative(double x){
		double h = x * 1e-7;
		return (funcToCalc(x+h)-funcToCalc(x))/h;
	}
	
	private double funcToCalc(double x){
		return Math.exp(-3 * x) - x + 1;
	}

}
