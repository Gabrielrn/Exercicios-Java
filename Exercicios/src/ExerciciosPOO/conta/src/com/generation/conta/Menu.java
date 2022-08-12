package com.generation.conta;

import com.generation.conta.model.Conta;

public class Menu {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(123456, "123", "CC", "João da Silva", 2000.50f);
		c1.visualizar();
		Conta c2 = new Conta(123457, "123", "CC", "Amanda", 200000.0f);
		c2.visualizar();
		
		//System.out.println("\nSaldo da Conta c1: " + c1.getSaldo());
		//System.out.println("\nSaldo da Conta c2: " + c2.getSaldo());
		
		c1.setSaldo(3000.0f);
		//System.out.println("Saldo atualizado da Conta c1: " + c1.getSaldo());
		c1.visualizar();
		
		c2.setTitular("Amanda Giacometti");
		c2.visualizar();
		//System.out.println("\nNome atualizado do titular da Conta c2: " + c2.getTitular());
		//sobrecarga permite ter 2 métodos com nomes iguais mas com assinaturas diferentes
		//exemplo: tenho um metodo int, eu posso criar o mesmo só quem com float e vai funcionar normalmente
		Conta c3 = new Conta();
		c3.visualizar();
				
		c3.setNumero(123458);
		c3.setTitular("Gabi");
		c3.setSaldo(500000.0f);
		
		c3.visualizar();
		
		if(c2.sacar(250000.0f) == true)
			c2.visualizar();
		//else
			//System.out.println("\nSaldo Insuficiente!");
	}
}
