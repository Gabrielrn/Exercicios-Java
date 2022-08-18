package Heranca;

public class Cavalo extends Animal{
	
	public Cavalo(String nome, int idade, String som) {
		super(nome, idade, som);
		// TODO Auto-generated constructor stub
	}

	private String correr;
	
	public void emitirSom() {
		System.out.println("Som do cavalo");
	}

	public void Correr() {
		System.out.println("Correndo...");
		
	}
}
