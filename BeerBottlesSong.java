
public class BeerBottlesSong {

	public static void main(String[] args) {
		song();

	}
	public static void song() {
		
		for (int bottlesNum = 99; bottlesNum > 0; bottlesNum--) {
			System.out.println(bottlesNum + " bottles of beer on the wall, " + bottlesNum + 
					" bottles of beer.");
			System.out.println("Take one down, pass it around, " + (bottlesNum-1) +
					" bottles of beer on the wall.");
			
			}
		System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
		System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
		
	}

}
