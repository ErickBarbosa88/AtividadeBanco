package atividadebanco;

public abstract class Conta {
	
	private double saldo;
	
	public abstract void sacar();
	public abstract void transferir();
	public abstract void depositar();
	
	public Conta( double saldo ) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
		

}
