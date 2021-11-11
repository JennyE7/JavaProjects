package interfaces;

public class Fish implements Animal, WaterAnimal {

	@Override
	public void numFins() {
		System.out.println("2");
		
	}

	@Override
	public void numGills() {
		System.out.println("8");
		
	}

	@Override
	public void skinType() {
		System.out.println("Scales");
		
	}

	@Override
	public void numLegs() {
		System.out.println("0");
		
	}

	@Override
	public void numArms() {
		System.out.println("0");
		
	}

	@Override
	public void diet() {
		System.out.println("Fish food");
		
	}
	
	

}
