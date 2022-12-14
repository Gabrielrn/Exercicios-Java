package Cliente;

public class Cliente {
	
	private String nome;
	private String contato;
	private String enderešo;
	private int idade;
	private String produto;
	
	public Cliente(String nome, String contato, String enderešo, int idade, String produto) {
		this.nome = nome;
		this.contato = contato;
		this.enderešo = enderešo;
		this.idade = idade;
		this.produto = produto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public void visualizar() {
		System.out.println("**************************************************************");
		System.out.println("\t\t\tDados do Cliente");
		System.out.println("**************************************************************");
		System.out.println("Nome do cliente: " + this.nome);
		System.out.println("Contato do cliente: " + this.contato);
		System.out.println("Enderešo do cliente: " + this.enderešo);
		System.out.println("Idade do cliente: " + this.idade);
		System.out.println("Produto comprado: " + this.produto);
	}
	
}
