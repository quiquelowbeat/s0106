package n1exercici4;

public class GenericMethods <T> {

	
	private T t1, t2, t3;
	
	public GenericMethods(T t1, T t2, T t3) { 
		
		this.t1 = null;
		this.t2 = null;
		this.t3 = null;
		
	}

	public static <T> void f(T ... tn) { // Llista d'arguments de variable indefinida.
		
		System.out.println("Lista de elementos:\n");
		
		for (T x : tn) {
			
			System.out.println(x);
			
		}
		
		System.out.println("\n");
		
	}
	
}
