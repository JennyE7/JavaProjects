package interfacesAbstraction;

public class IcedCaramelLatte  extends ColdDrink implements Drink, Coffee {

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
		System.out.println("Size medium");
		
	}

	@Override
	public void hasCream() {
		System.out.println("I come with whipped cream");
		
	}

	@Override
	public void isCarbonated() {
		System.out.println("I am not carbonated");
		
	}
	
	

}
