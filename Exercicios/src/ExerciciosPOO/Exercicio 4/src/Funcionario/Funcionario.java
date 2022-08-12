package Funcionario;

public class Funcionario {
	
	private String nome;
	private String codFuncionario;
	private double salario;
	private String endereco;
	private String contato;
	private String cnpj;
	private String carteiraDeTrabalho;
	
	public Funcionario(String nome, String codFuncionario, double salario, String endereco, String contato, String cnpj, String carteiraDeTrabalho) {
		this.nome = nome;
		this.codFuncionario = codFuncionario;
		this.salario = salario;
		this.endereco = endereco;
		this.contato = contato;
		this.cnpj = cnpj;
		this.carteiraDeTrabalho = carteiraDeTrabalho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodFuncionario() {
		return codFuncionario;
	}

	public void setCodFuncionario(String codFuncionario) {
		this.codFuncionario = codFuncionario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	public String getCarteiraDeTrabalho() {
		return carteiraDeTrabalho;
	}

	public void setCarteiraDeTrabalho(String carteiraDeTrabalho) {
		this.carteiraDeTrabalho = carteiraDeTrabalho;
	}

public void visualizar() {
		
		System.out.println("**************************************************************");
		System.out.println("\t\t\tDados do Funcionário");
		System.out.println("**************************************************************");
		System.out.println("Nome do funcionário: " + this.nome);
		System.out.println("Código do funcionário: " + this.codFuncionario);
		System.out.println("Número e série da carteira de trabalho: " + this.carteiraDeTrabalho);
		System.out.println("Salário do funcionário: " + this.salario);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Contato: " + this.contato);
		System.out.println("CNPJ: " + this.cnpj);
	}
	
}
