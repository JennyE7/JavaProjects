package interfaces;

public class Parrot implements Animal, Bird {


	@Override
	public void numLegs() {
		System.out.println("2");
		
	}

	@Override
	public void numArms() {
		System.out.println("0");
		
	}

	@Override
	public void diet() {
		System.out.println("Seeds");
		
	}

	@Override
	public void colourFeathers() {
		System.out.println("Multicoloured");
		
	}

	@Override
	public void numEggs() {
		System.out.println("2");
		
	}

	@Override
	public void hasNest() {
		System.out.println("Yes");
		
	}
	
	

}
