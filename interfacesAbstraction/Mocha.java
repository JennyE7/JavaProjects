package interfacesAbstraction;

public class Mocha implements Drink, Coffee {

	@Override
	public void hasMilk() {
		System.out.println("I contain milk");
		
	}

	@Override
	public void coffeeType() {
		System.out.println("Espresso");
		
	}

	@Override
	public void size() {
		System.out.println("Size small");
		
	}

	@Override
	public void hasCream() {
		System.out.println("I do not come with cream");
		
	}

}
