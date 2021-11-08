
public class EnhancedForLoops {

	public static void main(String[] args) {
				
		String[] namesArray = {"Jenny", "James", "Marshmallow", "Nutmeg", "Gimli"};
		
		for (int i = 0; i < namesArray.length; i++) {
			System.out.println(namesArray[i]);
		}
		
		int[] numArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		for (int i : numArray) {
			if (isTrue(i)) {
				System.out.println(i*i*i);
			}
			else {
				System.out.println(i*i);
			}
		}
		
	}
	
	
	public static boolean isTrue(int input) {
		if (input % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

}
