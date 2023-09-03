package usuarios;
import ferramentas.Emprestimo;

public class EstudantesPos extends Membro{

	
	
	protected int maxEmprestimos = 3;

	public EstudantesPos(String nome, String identificação, String endereco, String registro, Emprestimo[] emprestimos,
			int maxEmprestimos) {
		super(nome, identificação, endereco, registro, emprestimos);
		this.maxEmprestimos = maxEmprestimos;
	}

	
	
	
	
	
	
}
