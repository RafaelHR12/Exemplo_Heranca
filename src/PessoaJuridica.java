
public class PessoaJuridica extends Pessoa {

	private String cnpj;

    // Construtor da classe PessoaJuridica
    public PessoaJuridica(String nome, String endereco, String cnpj) {
        super(nome, endereco); // Chamada ao construtor da superclasse Pessoa
        this.cnpj = cnpj;
    }

    // Método para obter o CNPJ da pessoa jurídica
    public String getCnpj() {
        return cnpj;
    }

    // Método para definir o CNPJ da pessoa jurídica
    public void setCnpj(String cnpj) {
    	this.cnpj = cnpj;
    }

    // Método para exibir informações da pessoa jurídica
    @Override
    void exibirInformacoes() {
        super.exibirInformacoes(); // Chamada ao método da superclasse Pessoa
        System.out.println("CNPJ: " + cnpj);
    }
}
