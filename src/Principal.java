import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// Atribuindo valores as variáveis da Class Pessoa:

		Pessoa pessoa1 = new Pessoa();

		System.out.println("Informe o NOME: ");
		while (!pessoa1.setName(sc.nextLine())) {
			System.out.println("Informe o NOME novamente: ");
		}
		System.out.println("Informe o ENDERECO: ");
		while (!pessoa1.setEndereco(sc.nextLine())) {
			System.out.println("Informe o ENDERECO novamente: ");
		}

		PessoaFisica pesFisica1 = new PessoaFisica();
		
		System.out.println("Informe o CPF: ");
		while (!pesFisica1.setCpf(sc.next())) {
			System.out.println("Informe o CPF nvamente: ");
		}
		
		PessoaJuridica pesJuridica = new PessoaJuridica();
		
		System.out.println("Informe o CNPJ: ");
		while (!pesJuridica.setCnpj(sc.next())) {
			System.out.println("Informe o CNPJ nvamente: ");
		}
		
		System.out.println("\nNome: "+pessoa1.getName()+
				"\nENDEREÇO: "+pessoa1.getEndereco()+
				"\nCPF: "+pesFisica1.getCpf()+
				"\nCNPJ: "+pesJuridica.getCnpj());
	}

}
