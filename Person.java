
public class Person {

	public static void main(String[] args) {
	
	}
	
	private double height;
	private String name;
	private double shoeSize; 
	private String jobTitle;
	private int age;
	
	public Person (double height, String name, double shoeSize, String jobTitle, int age) {
		this.height = height;
		this.name = name;
		this.shoeSize = shoeSize;
		this.jobTitle = jobTitle;
		this.age = age;
	}
	
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

}
