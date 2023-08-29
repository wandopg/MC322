package materiais;


public class ItenMultimidia {

	protected String titulo;
	protected String autorOuArtista;
	protected String editoraOuGravdora;
	protected int anoPubli;
	protected String genero;
	protected String sinopse;
	

	// Metodo construtor

	public ItenMultimidia(String titulo, String autorOuArtista, String editoraOuGravdora, int anoPubli, String genero,
			String sinopse) {
		super();
		this.titulo = titulo;
		this.autorOuArtista = autorOuArtista;
		this.editoraOuGravdora = editoraOuGravdora;
		this.anoPubli = anoPubli;
		this.genero = genero;
		this.sinopse = sinopse;
	}
	
		
	// Outros metodos
		
	public String toString() {
		String out = "Titulo: "+getTitulo()+"\n";
		out = out + "Autor = " + getAutorOuArtista() +"\n";
		out = out + "Editor ou Gravadora = " + getEditoraOuGravdora() +"\n";
		out = out + "Ano de publicacao = " + getAnoPubli() +"\n";
		out = out + "Genero = " + getGenero() +"\n";
		out = out + "Sinopse = " + getSinopse() +"\n";
		return out;
	}

	// Metodos Get and Set 
	
	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutorOuArtista() {
		return autorOuArtista;
	}


	public void setAutorOuArtista(String autorOuArtista) {
		this.autorOuArtista = autorOuArtista;
	}


	public String getEditoraOuGravdora() {
		return editoraOuGravdora;
	}


	public void setEditoraOuGravdora(String editoraOuGravdora) {
		this.editoraOuGravdora = editoraOuGravdora;
	}


	public int getAnoPubli() {
		return anoPubli;
	}


	public void setAnoPubli(int anoPubli) {
		this.anoPubli = anoPubli;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getSinopse() {
		return sinopse;
	}


	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	
	


		
	
	
	
	
	
	
	
	
	
	
	
}