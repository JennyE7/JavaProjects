
public class Coins {

	public static void main(String[] args) {
	
		double cost = 3.6;
		double amount = 20;
		
		change(cost,amount);

	}
	
	public static void change(double cost, double amount) {
		
		double change = amount - cost;
		int amount10note = 0;
		int amount5note = 0;
		int amount1coin = 0;
		int amount50p = 0;
		int amount20p = 0;
		int amount10p = 0;
		int amount5p = 0;
		int amount2p = 0;
		int amount1p = 0;
		
		while (change >= 10) {
			change -= 10;
			amount10note++;			
		}
		while (change >= 5) {
			change -= 5;
			amount5note++;
		}
		while (change >= 1) {
			change -= 1;
			amount1coin++;
		}
		while (change >= 0.5) {
			change -= 0.5;
			amount50p++;
		}
		while (change >= 0.2) {
			change -= 0.2;
			amount20p++;
		}
		while (change >= 0.1) {
			change -= 0.1;
			amount10p++;
		}
		while (change >= 0.049) {
			change -= 0.05;
			amount5p++;
		}
		while (change >= 0.019) {
			change -= 0.02;
			amount2p++;
		}
		while (change >= 0.09) {
			change -= 0.01;
			amount1p++;
		}
		
		System.out.println("Your change is:");
		if (amount10note > 1) {
			System.out.println(amount10note + " £10 notes");
		}
		else if (amount10note == 1) {
			System.out.println(amount10note + " £10 note");
		}
		if (amount5note > 1) {
			System.out.println(amount5note + " £5 notes");
		}
		else if (amount5note == 1) {
			System.out.println(amount5note + " £5 note");
		}
		if (amount1coin > 1) {
			System.out.println(amount1coin + " £1 coins");
		}
		else if (amount1coin == 1) {
			System.out.println(amount1coin + " £1 coin");
		}
		if (amount50p > 1) {
			System.out.println(amount50p + " 50p coins");
		}
		else if (amount50p == 1) {
			System.out.println(amount50p + " 50p coin");
		}
		if (amount20p > 1) {
			System.out.println(amount20p + " 20p coins");
		}
		else if (amount20p == 1) {
			System.out.println(amount20p + " 20p coin");
		}
		if (amount10p > 1) {
		System.out.println(amount10p + " 10p coins");
		}
		else if (amount10p ==1 ) {
			System.out.println(amount10p + " 10p coin");
		}
		if (amount5p > 1) {
		System.out.println(amount5p + " 5p coins");
		}
		else if (amount5p ==1) {
			System.out.println(amount5p + " 5p coin");
		}
		if (amount2p > 1) {
			System.out.println(amount2p + " 2p coins");
		}
		else if (amount2p == 1) {
			System.out.println(amount2p + " 2p coin");
		}
		if (amount1p > 1) {
			System.out.println(amount1p + " 1p coins");
		}
		else if (amount1p == 1) {
			System.out.println(amount1p + " 1p coin");
		}
		
		System.out.println();
		System.out.println("Total change: £" + 
		((10 * amount10note) + (5 * amount5note) + amount1coin) +
		"." + ((50*amount50p) + (20*amount20p) + (10*amount10p) + (5*amount5p) + (2*amount2p) + amount1p));
	}

}
