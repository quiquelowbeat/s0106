package n1exercici2;

import n1exercici3.GenericMethods;
import n1exercici3.Student;

public class Main {

	public static void main(String[] args) {
		
		GenericMethods.f("Casa", "Puerta", "Mesa");
		
		GenericMethods.f(1, 34, 76);
		
		GenericMethods.f(new Student("Albert", "Carreras", "Tarragona"), new Student("Rosa", "Vileda", "Girona"), new Student("Josep", "Llop", "Sabadell"));

		GenericMethods.f(34, "Casa", new Student("Josep", "Llop", "Sabadell"));
		
	}

}
