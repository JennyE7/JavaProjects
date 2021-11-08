
public class StringManipulation {

	public static void main(String[] args) {
		
		String yesterday = "Yesterday it was raining, ";
		String today = "Today it is sunny";
		
		String sentence = yesterday.concat(today).toUpperCase();
		
		System.out.println(sentence);
		
		System.out.println(sentence.substring(26,38) + sentence.substring(17,24));

	}

}
