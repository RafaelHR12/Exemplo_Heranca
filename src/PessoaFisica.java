
public class PessoaFisica extends Pessoa {

	 private String cpf;

	    // Construtor da classe PessoaFisica
	    public PessoaFisica(String nome, String endereco, String cpf) {
	        super(nome, endereco); // Chamada ao construtor da superclasse Pessoa
	        this.cpf = cpf;
	    }

	    // Método para obter o CPF da pessoa física
	    public String getCpf() {
	        return cpf;
	    }

	    // Método para definir o CPF da pessoa física
	    public void setCpf(String cpf) {
	    	this.cpf = cpf;	       	
	    }

	    // Método para exibir informações da pessoa física
	    @Override
	    void exibirInformacoes() {
	        super.exibirInformacoes(); // Chamada ao método da superclasse Pessoa
	        System.out.println("CPF: " + cpf);
	    }
}
