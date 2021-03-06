package Main;

public class FixedIteration extends Main {

	//geras intervalas yra - isvestine funkcijos kuria apskaiciuoji = 1
	//tada ten taskas ir iki plius begalybes

	//q yra isvestines modulio susikirtimas su x
	//siuo atveju |-3*(e^(-3*x))| iki <1 (teorema)

	private Double[] array = new Double[getMaxIterationValue()];
	private final double q = 0.2;
	private final double precisionq = (1-q)/q;
	private double precision = 1 * 1e-7;

	public void doFixedIteration(){
		double approximation = -100000;
		precision = precision * precisionq;
		System.out.println("Performing Fixed-Point Iteration algorithm");
		for(int i = 0; i < getMaxIterationValue(); i++){
			array[i] = funcToCalc(approximation);
			System.out.println("Iteration: " + i + " result is " + array[i] + " the difference between last two iterations is " + (array[i] - approximation));
			approximation = array[i];
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
