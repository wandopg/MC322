package usuarios;

public class Funcionarios extends Membro {

	private String cargo;
	private int id;

	// Metodo construtor

	public Funcionarios(String nome, String cargo, int id, String cpf) {

		super (nome, cpf);
		this.cargo = cargo;
		this.id = id;
		

	}

	// Outros metodos

	public String toString() {
		String out = "Nome: " + getNome() + "\n";
		out = out + "Cargo = " + getCargo() + "\n";
		out = out + "ID = " + getId() + "\n";
		out = out + "CPF = " + getCpf() + "\n";
		return out;
	}

	// Metodos Get and Set

	// Cargo
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	// ID
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}