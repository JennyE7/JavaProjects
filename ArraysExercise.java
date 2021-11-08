
public class ArraysExercise {

	public static void main(String[] args) {

		forLoop();

	}

	public static void array() {

		int[] Array = new int[5];
		Array[0] = 4;
		Array[1] = 2;
		Array[2] = 6;
		Array[3] = 4;
		Array[4] = 8;

		for (int i : Array) {
			System.out.println(i);
		}
	}

	public static void forLoop() {
		 
		int[] intArray = new int[4];
		 
		 for (int i = 0; i < intArray.length; i++) {
			 intArray[i] = (i+3)*2;
			 System.out.println(intArray[i]);
		 }
		 
		 System.out.println();
		 
		 for (int j = 0; j < intArray.length; j++) {
			 intArray[j] = intArray[j] * 10;
			 System.out.println(intArray[j]);
		 }
	 }

}
