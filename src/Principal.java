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
		System.out.println("Informe a IDADE: ");
		while (!pessoa1.setIdade(sc.nextInt())) {
			System.out.println("Informe a IDADE novamente: ");
		}

		System.out.println("Informe o CPF: ");
		while (!pessoa1.setCpf(sc.next())) {
			System.out.println("Informe o CPF nvamente: ");
		}

		System.out.println("\nNome: "+pessoa1.getName()+
				"\nIdade: "+pessoa1.getIdade()+
				"\nCPF: "+pessoa1.getCpf());
	}

}
