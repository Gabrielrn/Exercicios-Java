package Heranca;

public class TestaAnimal {

	public static void main(String[] args) {
		
		//cachorro
				Cachorro cachorro = new Cachorro("Fred", 3, null);
				System.out.println("O nome do Cachorro é " + cachorro.getNome() + " e ele tem " + cachorro.getIdade() + " anos de idade");
				cachorro.emitirSom();
				cachorro.correr();
				
				//cavalo
				Cavalo cavalo = new Cavalo("Carpeado", 8, null);
				System.out.println("\nO nome do Cavalo é " + cavalo.getNome() + " e ele tem " + cavalo.getIdade() + " anos de idade");
				cavalo.emitirSom();
				cavalo.Correr();
				
				//preguiça
				Preguica preguiça = new Preguica("Ronald", 15, null);
				System.out.println("\nO nome da Preguiça é " + preguiça.getNome() + " e ele tem " + preguiça.getIdade() + " anos de idade");
				preguiça.emitirSom();
				preguiça.subir();

	}

}
