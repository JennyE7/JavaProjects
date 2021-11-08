
public class UniqueSum {

	public static void main(String[] args) {
		
		System.out.println(uniqueSum(4,6,9));
		

	}
	
	public static int uniqueSum(int num1, int num2, int num3) {
		
		if (num1 != num2 && num2 != num3 && num1 != num3) {
			return num1 + num2 + num3;
		}
		else if (num1 == num2) {
			if (num2 == num3) {
				return num1;
			}
			else return num1 + num3;
		}
		else return num1 + num2;
		
	}

}
