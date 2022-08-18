package Heranca;

public class Cachorro extends Animal{
	
	public Cachorro(String nome, int idade, String som) {
		super(nome, idade, som);
		// TODO Auto-generated constructor stub
	}

	private String correr;
	
	public void emitirSom() {
		System.out.println("Som do cachorro");
	}
	
	public void correr() {
		System.out.println("Correndo");
	}

}
