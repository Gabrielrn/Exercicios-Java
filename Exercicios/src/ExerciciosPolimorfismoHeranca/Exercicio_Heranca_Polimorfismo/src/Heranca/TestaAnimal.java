package Heranca;

public class TestaAnimal {

	public static void main(String[] args) {
		
		//cachorro
				Cachorro cachorro = new Cachorro("Fred", 3, null);
				System.out.println("O nome do Cachorro � " + cachorro.getNome() + " e ele tem " + cachorro.getIdade() + " anos de idade");
				cachorro.emitirSom();
				cachorro.correr();
				
				//cavalo
				Cavalo cavalo = new Cavalo("Carpeado", 8, null);
				System.out.println("\nO nome do Cavalo � " + cavalo.getNome() + " e ele tem " + cavalo.getIdade() + " anos de idade");
				cavalo.emitirSom();
				cavalo.Correr();
				
				//pregui�a
				Preguica pregui�a = new Preguica("Ronald", 15, null);
				System.out.println("\nO nome da Pregui�a � " + pregui�a.getNome() + " e ele tem " + pregui�a.getIdade() + " anos de idade");
				pregui�a.emitirSom();
				pregui�a.subir();

	}

}
