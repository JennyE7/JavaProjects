import java.util.ArrayList;
import java.util.Collections;



public class ArrayLists {

	public static void main(String[] args) {
		

	
		ArrayList<String> animals = new ArrayList<>();
		animals.add("Chicken");
		animals.add("Dog");
		animals.add("Bird");
		animals.add("Rabbit");
		
		System.out.println(animals);
		
		for (String animal : animals) {
			System.out.println(animal);
		}
		for (int i = 0; i <animals.size(); i++) {
			System.out.println(animals.get(i));
		}
		
		animals.get(0);
		animals.get(1);
		
		animals.set(2, "Parrot");
		animals.set(1, "Beagle");
		
		animals.remove(0);
		
		Collections.sort(animals);		
		Collections.reverse(animals);
		Collections.swap(animals, 0, 1);
	
		
		System.out.println(animals);
		
	}
	

}
