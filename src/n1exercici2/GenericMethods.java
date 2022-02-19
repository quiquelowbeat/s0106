package n1exercici2;

public class GenericMethods <T> {

	
	private T t1, t2, t3;
	
	public GenericMethods(T t1, T t2, T t3) { 
		
		this.t1 = null;
		this.t2 = null;
		this.t3 = null;
		
	}

	public static <T> void f(T t1, T t2, T t3) {
		
		System.out.println("Elemento 1: " + t1 + "\nElemento 2: " + t2 + "\nElemento 3: " + t3 + "\n"); 
		
	}
	
}
