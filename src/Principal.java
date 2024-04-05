import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// Atribuindo valores as variáveis da Class Pessoa:

		

		System.out.println("Informe o NOME: ");
		String nome = sc.nextLine();
		
		System.out.println("Informe o ENDERECO: ");
		String endereco = sc.nextLine();
		
		System.out.println("Informe o CPF: ");
		String cpf = sc.nextLine();

		System.out.println("Informe o CNPJ: ");
		String cnpj = sc.nextLine();
		
		// Criar instâncias de pessoa1, pesFisica1 e pesJuridica
		Pessoa pessoa1 = new Pessoa(nome, endereco);
		PessoaFisica pesFisica1 = new PessoaFisica(nome, endereco, cpf);
		PessoaJuridica pesJuridica = new PessoaJuridica(nome, endereco, cnpj);


		System.out.println("\nNome: " + pessoa1.getNome() + "\nENDEREÇO: " + pessoa1.getEndereco() + "\nCPF: "
				+ pesFisica1.getCpf() + "\nCNPJ: " + pesJuridica.getCnpj());
	}

}
