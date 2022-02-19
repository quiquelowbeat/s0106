package n1exercici3;

public class Main {

	public static void main(String[] args) { // Amb errors degut al enunciat.
		
		GenericMethods.f("Casa", "Puerta", "Mesa");
		
		GenericMethods.f(1, 34, 76);
		
		GenericMethods.f(new Student("Albert", "Carreras", "Tarragona"), new Student("Rosa", "Vileda", "Girona"), new Student("Josep", "Llop", "Sabadell"));
		
		GenericMethods.f(34, "Casa", new Student("Josep", "Llop", "Sabadell"));
		
		/* Conclusió: degut a haver tret un dels paràmetres a la definició del mètode, tinc error a la hora
		 * de cridar el mètode f(), degut a que envio 3 arguments i el mètode espera 3. 
		 */

	}

}
