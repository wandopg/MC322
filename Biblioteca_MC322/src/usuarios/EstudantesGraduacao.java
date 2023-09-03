package usuarios;

import ferramentas.Emprestimo;

public class EstudantesGraduacao extends Membro {


	protected int maxEmprestimos = 5;

	public EstudantesGraduacao(String nome, String identificação, String endereco, String registro, Emprestimo[] emprestimos,
			int maxEmprestimos) {
		super(nome, identificação, endereco, registro, emprestimos);
		this.maxEmprestimos = maxEmprestimos;
	}

	
	
	
	
	
	
}