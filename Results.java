
public class Results {
	
	public static void main(String[] args) {
		
		double physics = 50;
		double chemistry = 102;
		double biology = 150;
		
		
		results_total(physics, chemistry, biology);
		results_percentage(physics, chemistry, biology);
		pass_fail(physics, chemistry, biology);
		
	}
	

	public static void results_total(double phys, double chem, double bio) {
		
	double total = phys + chem + bio;
		
		System.out.println("Your mark for Physics is " + phys );
		System.out.println("Your mark for Chemistry is " + chem );
		System.out.println("Your mark for Biology is " + bio );
		System.out.println("Your total mark is " + total );
			
	}
	
	public static double results_percentage(double phys, double chem, double bio) {
		
		double total = phys + chem + bio;
		double percentage = (total * 100) / 450;
		
		System.out.println("Your overall percentage is " + percentage + "%");
		
		return percentage;
		
	}
	
	public static void pass_fail(double phys, double chem, double bio) {
		
		if (results_percentage(phys, chem, bio) <60) {
			System.out.println("Unfortunately you have failed.");			
		}
		else {
			if (phys / 150 < 0.6 && chem / 150 < 0.6 && bio / 150 < 0.6) {
				System.out.println("Unfortunately you have failed all 3 subjects.");
			}
			else if ((phys / 150 < 0.6	 && 	chem / 150 < 0.6	 && 	bio / 150 >= 0.6) || 
					(phys / 150 < 0.6	 && 	chem / 150 >= 0.6	 && 	bio / 150 < 0.6) ||
					(phys / 150 >= 0.6    && 	chem / 150 < 0.6	 && 	bio / 150 < 0.6)) {
				System.out.println("Unfortunately you have failed 2 subjects.");
			}
			else if ((phys / 150 < 0.6	 && 	chem / 150 >= 0.6	 && 	bio / 150 >= 0.6) || 
					(phys / 150 >= 0.6	 && 	chem / 150 >= 0.6	 && 	bio / 150 < 0.6) ||
					(phys / 150 >= 0.6    && 	chem / 150 < 0.6	 && 	bio / 150 >= 0.6)) {
				System.out.println("Unfortunately you have failed one subject.");
			}
			
			else System.out.println("Congratulations! You have passed!");
		}
		
	}
	
}

