
public class FlowChart {

	public static void main(String[] args) {
		

	}
	
	
	public static int flowChart(int num1, int num2, boolean bool) {
		
		if (bool) {
			return num1+num2;
		}
		else return num1 * num2;
	}
	
	
	public static void flowchart(int A) {
		
		if (A > 2000) {
			System.out.println("A is greater than 2000.");
			if (A > 6000) {
				System.out.println("A is greater than 6000.");
			}		
			else {
				System.out.println("A is 6000 or less");
				if (A > 4000) {
					System.out.println("A is greater than 4000");
				}
				else System.out.println("A is 4000 or less");
			}
		}
		else {
			System.out.println("A is 2000 or less");
			if (A > 100) {
				System.out.println("A is greater than 100");
				if (A > 600) {
					System.out.println("A is greater than 600");
				}
				else {
					System.out.println("A is 600 or less");
					if (A > 500) {
						System.out.println("A is greater than 500");
					}
					else System.out.println("A is 500 or less");
				}
			}
			else System.out.println("A is 100 or less");
			
		}
	}

}
