package materiais;

public class Cd extends ItenMultimidia {

	private int faixas;
	private int duracao;
	private int copias;
	private int copiasDisp;
	private String estado;
	
	// Metodo construtor
	
	public Cd(String titulo, String autorOuArtista, String editoraOuGravdora, int anoPubli, String genero,
			String sinopse, int faixas, int duracao, int copias, int copiasDisp, String estado) {
		super(titulo, autorOuArtista, editoraOuGravdora, anoPubli, genero, sinopse);
		this.faixas = faixas;
		this.duracao = duracao;
		this.copias = copias;
		this.copiasDisp = copiasDisp;
		this.estado = estado;
	}
	
		
	// Outros metodos
		
	public String toString() {
		String out = "Titulo = "+getTitulo()+"\n";
		return out;
	}

	

	// Metodos Get and Set 
	
	public int getFaixas() {
		return faixas;
	}

	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getCopias() {
		return copias;
	}

	public void setCopias(int copias) {
		this.copias = copias;
	}

	public int getCopiasDisp() {
		return copiasDisp;
	}

	public void setCopiasDisp(int copiasDisp) {
		this.copiasDisp = copiasDisp;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
		
	
}