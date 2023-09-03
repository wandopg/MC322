package materiais;

public class LivroFisico extends ItenMultimidia {

	private int isbn;
	private int edicao;
	private int copias;
	private int copiasDisponiveis;
	private String localizacao;
	private String estado;
	
	
	
	// Metodo construtor
	
	public LivroFisico(String titulo, String autorOuArtista, String editoraOuGravdora, int anoPubli, String genero,
			String sinopse, int isbn, int edicao, int copias, int copiasDisponiveis, String localizacao,
			String estado) {
		super(titulo, autorOuArtista, editoraOuGravdora, anoPubli, genero, sinopse);
		this.isbn = isbn;
		this.edicao = edicao;
		this.copias = copias;
		this.copiasDisponiveis = copiasDisponiveis;
		this.localizacao = localizacao;
		this.estado = estado;
	}


	// Metodos Get and Set
	
	public int getIsbn() {
		return isbn;
	}


	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}


	public int getEdicao() {
		return edicao;
	}


	public void setEdicao(int edicao) {
		this.edicao = edicao;
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
	
	
	// String 
	
	public String toString() {
		String out = "Titulo: "+getTitulo()+"\n";
		out = out + "Autor = " + getAutorOuArtista() +"\n";
		out = out + "Editor ou Gravadora = " + getEditoraOuGravdora() +"\n";
		out = out + "Ano de publicacao = " + getAnoPubli() +"\n";
		out = out + "Genero = " + getGenero() +"\n";
		out = out + "Sinopse = " + getSinopse() +"\n";
		out = out + "ISBN = " + getIsbn() +"\n";
		out = out + "Edicao = " + getEdicao() +"\n";
		out = out + "Copias por edicao = " + getCopias() +"\n";
		out = out + "Copias disponiveis = " + getCopiasDisponiveis() +"\n";
		out = out + "Localisacao na biblioteca = " + getLocalizacao() +"\n";
		out = out + "Estado de Conservacao = " + getEstado() +"\n";
		
		return out;
	}
	
	

}