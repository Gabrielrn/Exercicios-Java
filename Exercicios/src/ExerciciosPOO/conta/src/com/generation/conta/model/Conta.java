package com.generation.conta.model;

public class Conta {
	
	private int numero;
	private String agencia;
	private String tipo;
	private String titular;
	private float saldo;
	
	//m�todo construtor vai criar o objeto
	public Conta(int numero, String agencia, String tipo, String titular, float saldo) {
		this.numero = numero;//o atributo n�mero vai receber o par�metro n�mero que veio no m�trodo construtor
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}
	//sobrecarga permite ter 2 m�todos com nomes iguais mas com assinaturas (o que esta dentro dos parenteses) diferentes
	//exemplo: tenho um metodo int, eu posso criar o mesmo s� quem com float e vai funcionar normalmente
	public Conta() {
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero; 
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacar(float valor) {
		if(valor <= saldo) {
			saldo -= valor;
			return true;
		}
		else 
			System.out.println("\nVoc� tentou sacar " + valor + ", mas seu saldo �: " + saldo);
			return false;
	}
	
	public void visualizar() {
		
		System.out.println("**************************************************************");
		System.out.println("\t\t\tDados da Conta");
		System.out.println("**************************************************************");
		System.out.println("N�mero da Conta: " + this.numero);
		System.out.println("N�mero da Ag�ncia: " + this.agencia);
		System.out.println("Tipo da Conta: " + this.tipo);
		System.out.println("Nome do titular da Conta: " + this.titular);
		System.out.println("Saldo da Conta: " + this.saldo);
	}
	
}
