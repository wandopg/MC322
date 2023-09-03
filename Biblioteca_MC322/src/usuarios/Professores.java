package usuarios;

import ferramentas.Emprestimo;

public class Professores extends Membro {

	protected int maxEmprestimos = 7;

	public Professores(String nome, String identificação, String endereco, String registro, Emprestimo[] emprestimos,
			int maxEmprestimos) {
		super(nome, identificação, endereco, registro, emprestimos);
		this.maxEmprestimos = maxEmprestimos;
	}

	
	
	
	
}
