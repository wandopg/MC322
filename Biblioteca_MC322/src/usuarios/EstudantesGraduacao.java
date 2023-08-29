package usuarios;

public class EstudantesGraduacao extends Membro {

	private int ra;

	// Metodo construtor

	public EstudantesGraduacao(String nome, int ra, String cpf) {

		super (nome, cpf);
		this.ra = ra;
		

	}

	// Outros metodos

	public String toString() {
		String out = "Nome: " + getNome() + "\n";
		out = out + "Ra = " + getRa() + "\n";
		out = out + "CPF = " + getCpf() + "\n";
		return out;
	}

	// Metodos Get and Set

	// Ra
	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

}