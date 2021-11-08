
public class Taxes {

	public static void main(String[] args) {
		
		double sal = 43800;
		
		taxAmount(sal);
		System.out.println(taxAmount2(sal));

	}
	
	public static double taxPercent(double salary) {
		
		if (salary < 15000) {
			return 0;
		}
		else if (salary < 20000) {
			return 0.1;
		}
		else if (salary < 30000) {
			return 0.15;
		}
		else if (salary < 45000) {
			return 0.2;
		}
		else return 0.25;
	}
	
	public static double taxAmount(double salary) {
		
		if (salary < 15000) {
			double tax = 0;
			System.out.println(tax);
			return tax;
		}
		else if (salary < 20000) {
			double tax = salary * 0.1; 
			System.out.println(tax);
			return tax;
		}
		else if (salary < 30000) {
			double tax = salary * 1.5;
			System.out.println(tax);
			return tax;
		}
		else if (salary < 45000) {
			double tax = salary * 0.2;
			System.out.println(tax);
			return tax;
		}
		else {
			double tax = salary * 0.25;
			System.out.println(tax);
			return tax;
		}
		
	}
	
	public static double taxAmount2(double salary) {
		double tax = salary * taxPercent(salary);
		return tax;
	}

}
