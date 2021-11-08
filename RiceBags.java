
public class RiceBags {

	public static void main(String[] args) {
		
		System.out.println( minSmallBags(14,1,9) );

	}
	
	public static int minSmallBags(int goalKilos, int largeBag, int smallBag) {
		
		if (smallBag == 0) {
			if (goalKilos % 5 == 0 && (goalKilos / 5 ) <= largeBag) {
				return 0;
			}
			else {
				return -1;
			}
		}
		else {		
			while (goalKilos >= 5 && largeBag > 0) {	//counting how many large bags to use
				goalKilos -= 5;
				largeBag--;
			}
			if (largeBag == 0) {	//if all large bags have been used
				if (smallBag >= goalKilos) {	//if we have enough smallBags to cover what's left
					return goalKilos;
				}
				else { 	// if we don't have enough smallBags we've run out of bags altogether
					return -1;
				}
			}
			else if (goalKilos <= smallBag) {	//if we have more smallBags left than kilos we need
				return goalKilos;
			}
			else {	//if there are fewer smallBags than kilos we need, it cannot be done, return -1
				return -1;
			}
		}
	}

}
