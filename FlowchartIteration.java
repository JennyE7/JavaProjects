
public class FlowchartIteration {

	public static void main(String[] args) {
		 numPrint2();

	}
	
	public static void iterationFlowchart1() {
		
		
		for (int A = 100; A <= 200; A++) {
			System.out.println(A);
		};
	}
	
	public static void iterationFlowchart2() {
		
		for (int A = 100; A <= 200; A++) {
			if (A % 2 ==0) {
				System.out.println("-");
			}
			else System.out.println("*");
		}
		
	}
	
	public static void numPrint() {
		
		for (int iter = 1; iter <= 10; iter++) {
			System.out.println();
			System.out.println("Print iteration " + iter);
			for (int num = 1; num <=10; num++) {
				System.out.println(num);
			}
		}
	}
		
		public static void numPrint2() {
			
			for (int i = 1; i <= 10; i++) {
				
				for(int j = i; j >= 1; j--) {
					System.out.println(i);	
				}
			}
		}
	

}
