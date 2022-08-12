package ExecutaFuncionario;

import Funcionario.Funcionario;

public class ExecutaFuncionario {

	public static void main(String[] args) {
		
		
		Funcionario func = new Funcionario("João Pedro", "762", 5320.0, "Rua Imaginária", "(11) 9999-9999", "00.000.000/0000-00", "0829935.4938");
		func.visualizar();
	}

}
