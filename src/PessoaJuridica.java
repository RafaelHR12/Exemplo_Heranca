
public class PessoaJuridica extends Pessoa {

	private String cnpj;
	
	public String getCnpj () {
		return cnpj;
	}
	
	public boolean setCnpj (String cnpj) {
		cnpj = cnpj.replaceAll("[^\\d]", "");

		if (cnpj.matches("\\d{14}")) {
			this.cnpj = cnpj;
			return true;
		}
		return false;
	}
}
