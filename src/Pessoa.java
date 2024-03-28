
public class Pessoa {

	// Encapsulamento de Atributos;
	private String name;
	private int idade;
	private String cpf;

	// Getters (Método para acessar os valores) e Setter (Método para modificar os
	// valores);
	public String getName() {
		return name;
	}

	public boolean setName(String name) {
		if (name.length() > 2) { // Validação do atributo name;
			this.name = name;
			return true;
		}
		return false;
	}

	public int getIdade() {
		return idade;
	}

	public boolean setIdade(int idade) {
		if (idade > 0) {
			this.idade = idade;
			return true;
		}
		return false;
	}

	public String getCpf() {
		return cpf;
	}

	public boolean setCpf(String cpf) {
		cpf = cpf.replaceAll("[^\\d]", "");

		if (cpf.matches("\\d{11}")) {
			this.cpf = cpf;
			return true;
		}
		return false;
	}

}
