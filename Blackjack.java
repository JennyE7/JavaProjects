
public class Blackjack {
	
	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 20;
		
		System.out.println(blackJack(num1,num2));
		
	}
	
	public static int blackJack(int int1, int int2) {
		
		if (int1 > int2) {
			if (int1<=21) {
				return int1;
			}
			else if (int2 <= 21) {
				return int2;
			}
			else return 0;
		}
		
		else if (int2 > int1) {
			if (int2<=21) {
				return int2;
			}
			else if (int1 <= 21) {
				return int1;
			}
			else return 0;
		}
		else {
			if (int1 > 21) {
				return 0;
			}
			else return int1;
		}
		
	}

}
