package n1exercici1;

public class NoGenericMethods {

	private String name, lastName, city;
	
	public NoGenericMethods(String city, String name, String lastName) { // Els arguments es poden posar en qualsevol ordre.
		
		this.name = name;
		this.lastName = lastName;
		this.city = city;
		
	}

	// Mètodes getters i setters:
	
	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		
		this.name = name;
	}

	public String getLastName() {
		
		return lastName;
	}

	public void setLastName(String lastName) {
		
		this.lastName = lastName;
	}

	public String getCity() {
		
		return city;
	}

	public void setCity(String city) {
		
		this.city = city;
	}
	
}
