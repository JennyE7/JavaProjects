
public class PrimeFactorisation {

	public static void main(String[] args) {
		System.out.println(LargestPrimeFactor(87));

	}
	
	public static int LargestPrimeFactor(double num) {
		
		int LargestFactor = 1;	
		
		for (int i = 3; i<500; i++) {
			for (int j = 2; j < i; j++) {	//check if i prime
				if (i/j % 1 != 0) {
					if ((num/i) % 1 == 0) {
						LargestFactor = i;
					}
				}
				
			}
		}
		
		return LargestFactor;
	}
	
	
	

}
