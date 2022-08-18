package Heranca;

public class Preguica extends Animal{
	
	private String subir;
	
	public Preguica(String nome, int idade, String som) {
		super(nome, idade, som);
		// TODO Auto-generated constructor stub
	}

	public void emitirSom() {
		System.out.println("Som da preguiça");
	}
	
	public void subir() {
		System.out.println("Subindo..");
	}
}
