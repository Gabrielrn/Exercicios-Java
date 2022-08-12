package ExecutaCliente;

import Cliente.Cliente;

public class ExecutaCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Mateus", "(11) 9999-9999", "Rua Imaginária", 18, "Bicicleta");
		cliente1.visualizar();
	}
}
