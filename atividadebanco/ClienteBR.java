package atividadebanco;

public class ClienteBR {

	private String nome;
	private Fisico clienteF;
	private Juridico clienteJ;
	
	
	public ClienteBR(String nome, Fisico clienteF, Juridico clienteJ) {
		this.nome = nome;
		this.clienteF = clienteF;
		this.clienteJ = clienteJ;
	}	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Fisico getClienteF() {
		return clienteF;
	}

	public void setClienteF(Fisico clienteF) {
		this.clienteF = clienteF;
	}

	public Juridico getClienteJ() {
		return clienteJ;
	}

	public void setClienteJ(Juridico clienteJ) {
		this.clienteJ = clienteJ;
	}

}
