package membros;
/* LAB1
Wanderley Pedroso da Graca Barion RA: 225790
Yuri Rocha Cunha RA: 250570
*/

public class Usuarios {

	private String nome;
	private String tipo;
	private int id;
	private String cpf;

	// Metodo construtor

	public Usuarios(String nome, String tipo, int id, String cpf) {

		this.nome = nome;
		this.tipo = tipo;
		this.id = id;
		this.cpf = cpf;
	}

	// Outros metodos

	public String toString() {
		String out = "Nome: " + getNome() + "\n";
		out = out + "Tipo = " + getTipo() + "\n";
		out = out + "ID = " + getId() + "\n";
		out = out + "CPF = " + getCpf() + "\n";
		return out;
	}

	// Metodos Get and Set

	// Nome
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// Tipo
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// ID
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// CPF
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}