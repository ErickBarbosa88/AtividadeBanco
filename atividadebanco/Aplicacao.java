package atividadebanco;

// import java.util.ArrayList;
// import java.util.List;
import java.util.Scanner;

public class Aplicacao {

	// public static List<ClienteBR> listaDeClientes = new ArrayList<ClienteBR>();
	// public static List<Fisico> listaDeClientesF = new ArrayList<Fisico>();
	// public static List<Juridico> listaDeClientesJ = new ArrayList<Juridico>();

	public static void sacar() {

		double saldo = 0.0;

		Poupanca P = new Poupanca(saldo);
		P.sacar();
		menu();
	}

	public static void sacarC() {

		double saldo = 0.0;

		Corrente C = new Corrente(saldo);
		C.sacar();
		menu();
	}

	public static void Trasnferir() {

		double saldo = 0.0;

		Poupanca P = new Poupanca(saldo);
		P.transferir();
		menu();

	}

	public static void TrasnferirC() {

		double saldo = 0.0;

		Corrente C = new Corrente(saldo);
		C.transferir();
		menu();

	}

	public static void Depositar() {

		double saldo = 0.0;

		Poupanca P = new Poupanca(saldo);
		P.depositar();
		menu();

	}

	public static void DepositarC() {

		double saldo = 0.0;

		Corrente C = new Corrente(saldo);
		C.depositar();
		menu();

	}

	public static void Corrente() {
		Scanner input = new Scanner(System.in);

		int opcao;

		System.out.println("Voce escolheu Conta Corrente.");
		System.out.println("O que deseja fazer: ");
		System.out.println("1 - Sacar");
		System.out.println("2 - Transferir");
		System.out.println("3 - Depositar");
		opcao = input.nextInt();

		switch (opcao) {
			case 1:
				sacarC();
				break;
			case 2:
				TrasnferirC();
				break;
			case 3:
				DepositarC();
				break;

			default:
				break;
		}
	}

	public static void Poupanca() {
		Scanner input = new Scanner(System.in);

		int opcao;

		System.out.println("Voce escolheu Conta Poupança.");
		System.out.println("O que deseja fazer: ");
		System.out.println("1 - Sacar");
		System.out.println("2 - Transferir");
		System.out.println("3 - Depositar");
		opcao = input.nextInt();

		switch (opcao) {
			case 1:
				sacar();
				break;
			case 2:
				Trasnferir();
				break;
			case 3:
				Depositar();
				break;

			default:
				break;
		}

	}

	public static void fisica() {
		Scanner input = new Scanner(System.in);

		double cpf = 0.0;
		int opcao;

		Fisico F = new Fisico(cpf);

		System.out.println("Digite seu CPF para continuar");
		cpf = input.nextDouble();
		F.setCpf(cpf);
		System.out.println("Seja bem vindo seu CPF é: " + F.getCpf());

		System.out.println("Que tipo de conta deseja acessar: ");
		System.out.println("1 - Poupança");
		System.out.println("2 - Corrente");
		opcao = input.nextInt();

		switch (opcao) {
			case 1:
				Poupanca();
				break;
			case 2:
				Corrente();
				break;
			default:
				break;
		}

	}

	public static void juridica() {
		Scanner input = new Scanner(System.in);

		double cnpj = 0.0;
		int opcao;

		Juridico J = new Juridico(cnpj);

		System.out.println("Digite seu CNPJ para continuar");
		cnpj = input.nextDouble();
		J.setCnpj(cnpj);
		System.out.println("Seja bem vindo seu CNPJ é: " + J.getCnpj());

		System.out.println("Que tipo de conta deseja acessar: ");
		System.out.println("1 - Poupança");
		System.out.println("2 - Corrente");
		opcao = input.nextInt();

		switch (opcao) {
			case 1:
				Poupanca();
				break;
			case 2:
				Corrente();
				break;
			default:
				break;
		}
	}

	public static void menu() {

		Scanner input = new Scanner(System.in);

		int opcao;

		System.out.println("=================================");
		System.out.println("Bem Vindo ao BankCatolic");
		System.out.println("Escolha: ");
		System.out.println("1 - Pessoa Física");
		System.out.println("2 - Pessoa Juridica");
		System.out.println("3 - Sair");
		opcao = input.nextInt();

		switch (opcao) {
			case 1:
				fisica();
				break;
			case 2:
				juridica();
				break;
			case 3:
				System.out.println("Obrigado Cliente!! ");
				break;
			default:
				break;
		}
	}

	public static void main(String[] args) {

		menu();

	}

}
