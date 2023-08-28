package usuarios;
/* LAB1
Wanderley Pedroso da Graca Barion RA: 225790
Yuri Rocha Cunha RA: 250570
*/

public class Membro {

	protected String nome;
	protected String cpf;

	// Metodo construtor

	public Membro(String nome, String cpf) {

		this.nome = nome;
		this.cpf = cpf;
	}

	// Outros metodos

	public String toString() {
		String out = "Nome: " + getNome() + "\n";
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

	// CPF
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}