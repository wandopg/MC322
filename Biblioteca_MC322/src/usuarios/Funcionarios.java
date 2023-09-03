package usuarios;

import ferramentas.Emprestimo;

public class Funcionarios extends Membro {



	protected int maxEmprestimos = 4;

	public Funcionarios(String nome, String identificação, String endereco, String registro, Emprestimo[] emprestimos,
			int maxEmprestimos) {
		super(nome, identificação, endereco, registro, emprestimos);
		this.maxEmprestimos = maxEmprestimos;
	}

}