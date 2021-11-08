
public class FizzBuzz {

	public static void main(String[] args) {
		
		System.out.println(fizzBuzz(3));

	}
	
	public static String fizzBuzz(int num) {
		
		if (num % 3 == 0) {
			if (num % 5 ==0) {
				return "FizzBuzz";
			}
			else return "Fizz";
		}
		else if (num % 5 ==0) {
			return "Buzz";
		}
		else return String.valueOf(num);
	}

}
