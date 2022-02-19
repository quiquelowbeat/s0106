package n1exercici4;

public class Main {

	public static void main(String[] args) {
		
		GenericMethods.f("Casa", "Puerta", "Mesa");
		
		GenericMethods.f(1, 34, 76);
		
		GenericMethods.f(new Student("Albert", "Carreras", "Tarragona"), new Student("Rosa", "Vileda", "Girona"), new Student("Josep", "Llop", "Sabadell"));
		
		GenericMethods.f(34, "Casa", new Student("Josep", "Llop", "Sabadell"));
		
		GenericMethods.f(45, 67, "Casa", new Student("Josep", "Llop", "Sabadell"), "Puerta", 76, new Student("Rosa", "Vileda", "Girona"));

	}

}
