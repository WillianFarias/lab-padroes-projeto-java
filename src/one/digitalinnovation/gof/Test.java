package one.digitalinnovation.gof;

public class Test {

	public static void main(String[] args) {

		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonLazy novoLazy = SingletonLazy.getInstancia();
		System.out.println(novoLazy);
	}

}
