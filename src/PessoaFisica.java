
public class PessoaFisica extends Pessoa {

	private String cpf;
	
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
