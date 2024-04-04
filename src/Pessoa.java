
public class Pessoa {

	private String nome;
	private String endereco;

	// Construtor da classe Pessoa
	public Pessoa(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	// Método para obter o nome da pessoa
	public String getNome() {
		return nome;
	}

	// Método para definir o nome da pessoa
	public boolean setNome(String nome) {
		if (nome.length() > 5) {
			this.nome = nome;
			return true;
		}
		return false;
	}

	// Método para obter o endereco da pessoa
	public String getEndereco() {
		return endereco;
	}

	// Método para definir o endereco da pessoa
	public boolean setEndereco(String endereco) {
		if (endereco.length() > 5) {
			this.endereco = endereco;
			return true;
		}
		return false;
	}

	// Método para exibir informações da pessoa
	void exibirInformacoes() {
		System.out.println("Nome: " + nome);
		System.out.println("Endereço: " + endereco);
	}
}
