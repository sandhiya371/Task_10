package Task10;

//QUS:1
 
public class Person {
 
	public String name;
	public int age;
 
	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
 
	// Getter for name
	public String getName() {
		return name;
	}
 
	// Getter for age
	public int getAge() {
		return age;
	}
 
	// Optionally, you can include a toString() method for easy printing
	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + "}";
	}
 
	// Main method for demonstration
	public static void main(String[] args) {
 
		Person per = new Person("Sandhiya", 20);
		System.out.println("Name: " + per.getName());
		System.out.println("Age: " + per.getAge());
	}
 
}

