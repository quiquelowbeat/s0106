package n1exercici2;

public class Student {
	
	private String name, lastName, city;
	
	public Student(String name, String lastName, String city) {
		
		this.name = name;
		this.lastName = lastName;
		this.city = city;
		
	}
	
	public String toString() {
		
		return this.name + " " + this.lastName + " - " + this.city;
		
	}

}
