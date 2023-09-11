package usuarios;
import ferramentas.Emprestimo;


public class Membro {


	protected String nome;
	protected String identificação ;
	private String endereco;
	private String registro;
	private int maxEmprestimos;  
	private Emprestimo[] emprestimos;


	// Metodo construtor

	
	
	public Membro(String nome, String identificação, String endereco, String registro,
			Emprestimo[] emprestimos) {
		super();
		this.nome = nome;
		this.identificação = identificação;
		this.endereco = endereco;
		this.registro = registro;
		this.emprestimos = emprestimos;
	}

	public void addImprestimo(Emprestimo emprestimo) {
		if (emprestimos.length < maxEmprestimos ) {
			emprestimos[( emprestimos.length + 1 )] = emprestimo;
		}
	}

	
	
	// Metodos Get and Set
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdentificação() {
		return identificação;
	}

	public void setIdentificação(String identificação) {
		this.identificação = identificação;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public int getMaxEmprestimos() {
		return maxEmprestimos;
	}

	public void setMaxEmprestimos(int numEmprestimos) {
		this.maxEmprestimos = numEmprestimos;
	}

	public Emprestimo[] getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(Emprestimo[] emprestimos) {
		this.emprestimos = emprestimos;
	}
	
	
	

	
	
}