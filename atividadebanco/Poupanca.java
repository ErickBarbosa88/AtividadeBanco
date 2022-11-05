package atividadebanco;

import java.util.Scanner;

import javax.swing.InputMap;

public class Poupanca extends Conta {

	public Poupanca(double saldo) {
		super(saldo);

	}

	@Override
	public void sacar() {
		

		Scanner input = new Scanner(System.in);
		System.out.println("Informe quanto quer sacar: ");
		this.setSaldo(input.nextDouble());
		System.out.println("Dinheiro sacado: "+ this.getSaldo());

	}

	@Override
	public void transferir() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe pra quem voce quer trasnferir: ");
		String nome = input.next();
		System.out.println("Quanto ira transferir");
		this.setSaldo(input.nextDouble());
		System.out.println("Dinheiro transferido: "+ this.getSaldo()+ " para [" + nome + "]");
	}

	@Override
	public void depositar() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe quanto quer depositar");
		this.setSaldo(input.nextDouble());
		System.out.println("Dinheiro depositado: "+ this.getSaldo());
	}

}
