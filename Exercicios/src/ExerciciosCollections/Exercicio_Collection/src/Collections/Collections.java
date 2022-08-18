package Collections;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		
		ArrayList <String> produtos = new ArrayList<String>();
		
		produtos.add("Placa de vídeo");
		produtos.add("Processador");
		produtos.add("Gabinete");
		produtos.add("Teclado");
	
		System.out.println(produtos.toString());
	
		produtos.remove(3);
		System.out.println(produtos.toString());
	
		produtos.set(2, "Mouse");
		System.out.println(produtos.toString());

	}

}
