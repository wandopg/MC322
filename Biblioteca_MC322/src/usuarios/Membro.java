package usuarios;
import ferramentas.Emprestimo;

/* LAB1
Wanderley Pedroso da Graca Barion RA: 225790
Yuri Rocha Cunha RA: 250570
*/

public class Membro {


	protected String nome;
	protected String cpf;
	private Emprestimo[] emprestimos;
	private int numEmprestimos;


	// Metodo construtor

	public Membro(String nome, String cpf) {

		emprestimos = new Emprestimo[4]; // um membro pode ter até 4 emprestimos de uma vez
		numEmprestimos = 0;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void addImprestimo(Emprestimo emprestimo) {
		if (numEmprestimos < emprestimos.length) {
			emprestimos[numEmprestimos] = emprestimo;
			numEmprestimos++;
		}
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

	public Emprestimo[] getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(Emprestimo[] emprestimos) {
		this.emprestimos = emprestimos;
	}

	
	
}