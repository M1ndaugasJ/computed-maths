package main;

public class FixedIteration extends Main {

	private Double[] array = new Double[getMaxIterationValue()];
	private final double precision = 1 * 1e-14;
	
	public void doFixedIteration(){
		double artinys = 2;
		System.out.println("Performing Fixed-Point Iteration algorithm");
		for(int i = 0; i < getMaxIterationValue(); i++){
			array[i] = funcToCalc(artinys);
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
	
	public double funcToCalc(double x){
		return Math.exp(-3 * x) + 1;
	}
	
}
