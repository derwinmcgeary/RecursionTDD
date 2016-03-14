
public class Factorial {

	public long calculate(int input) {
/** 
 * Calculate factorial of input recursively
 * Return -1 for error
 */
		if (input < 0 ) return -1;
		if(input == 0) { 
			return 1; 
			} 
		else { 
			return(input * calculate(input - 1));
		}
	}
	
	public static void main(String[] args) {
		Factorial f = new Factorial();
		long result = f.calculate(5);
		System.out.println("" + result);
	}
}
