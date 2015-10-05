package Main;

public class NewtonRaphson extends Main {

	private final double precision = 1 * 1e-16;
	private Double[] array = new Double[1000] ;
	public void doNewtonRaphson(){
		System.out.println("Performing Newton-Raphson algorithm");
		double artinys = 100;
		for(int i = 0; i <= getMaxIterationValue(); i++){
			array[i] = artinys - (funcToCalc(artinys)/findDerivative(artinys));
			System.out.println("Iteration: " + i + " result is " + array[i] + " the difference between last two iterations is " + (array[i] - artinys));
			artinys = array[i];
			if(i>0){
				if(Math.abs(array[i] - array[i-1]) < precision){
					System.out.println("Sprendinys: " + array[i]);
					break;
				}
			}
			if(i==getMaxIterationValue()){
				System.out.println("Nepavyko rasti sprendinio. Situacija nekorektiska");
			}
		}
	}
	
	private double findDerivative(double x){
		double h = x * 1e-9;
		return (funcToCalc(x+h)-funcToCalc(x))/h;
	}
	
	private double funcToCalc(double x){
		return Math.exp(-3 * x * x) - x;
	}

}
