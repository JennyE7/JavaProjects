package abstraction;

public class Dog extends Animal {

	@Override
	public void numLegs() {
		System.out.println("4");
		
	}

	@Override
	public void diet() {
		System.out.println("Dog food");
		
	}
	
	public void barkStyle() {
		System.out.println("Yap");
	}

}
