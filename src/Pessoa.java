
public class Pessoa {

	// Encapsulamento de Atributos;
	private String name;
	private String endereco;
	
	// Getters (Método para acessar os valores) e Setter (Método para modificar os valores);
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
	
	public String getEndereco() {
		return endereco;
	}
	
	public boolean setEndereco(String endereco) {
		if (endereco.length() > 4) {
			this.endereco = endereco;
			return true;
		}
		return false;
	}

}
