package materiais;

public class OutrosRecursos extends ItenMultimidia {

	private String tipos;
	private String Formato;
	private int copias;
	private int copiasDisponiveis;
	private String localizacao;
	private String estado;
	
	
	// Construtor
	
	public OutrosRecursos(String titulo, String autorOuArtista, String editoraOuGravdora, int anoPubli, String genero,
			String sinopse, String tipos, String formato, int copias, int copiasDisponiveis, String localizacao,
			String estado) {
		super(titulo, autorOuArtista, editoraOuGravdora, anoPubli, genero, sinopse);
		this.tipos = tipos;
		Formato = formato;
		this.copias = copias;
		this.copiasDisponiveis = copiasDisponiveis;
		this.localizacao = localizacao;
		this.estado = estado;
	}

	
	// Metodos Get and Set
	
	public String getTipos() {
		return tipos;
	}


	public void setTipos(String tipos) {
		this.tipos = tipos;
	}


	public String getFormato() {
		return Formato;
	}


	public void setFormato(String formato) {
		Formato = formato;
	}


	public int getCopias() {
		return copias;
	}


	public void setCopias(int copias) {
		this.copias = copias;
	}


	public int getCopiasDisponiveis() {
		return copiasDisponiveis;
	}


	public void setCopiasDisponiveis(int copiasDisponiveis) {
		this.copiasDisponiveis = copiasDisponiveis;
	}


	public String getLocalizacao() {
		return localizacao;
	}


	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
	
	
	
	
}
