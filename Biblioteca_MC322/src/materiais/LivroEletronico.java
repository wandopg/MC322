package materiais;

public class LivroEletronico extends ItenMultimidia {

	private String formato;
	private int licencas;
	private String formatoArq;
	private String url;
	private String requisitos;
	private String data;
	
	// Metodo construtor

	public LivroEletronico(String titulo, String autorOuArtista, String editoraOuGravdora, int anoPubli, String genero,
			String sinopse, String formato, int licencas, String formatoArq, String url, String requisitos,
			String data) {
		super(titulo, autorOuArtista, editoraOuGravdora, anoPubli, genero, sinopse);
		this.formato = formato;
		this.licencas = licencas;
		this.formatoArq = formatoArq;
		this.url = url;
		this.requisitos = requisitos;
		this.data = data;
	}
		
	// Outros metodos
		
	public String toString() {
		String out = "Titulo: "+getTitulo()+"\n";
		out = out + "Autor = " + getAutorOuArtista() +"\n";
		out = out + "Editor ou Gravadora = " + getEditoraOuGravdora() +"\n";
		out = out + "Ano de publicacao = " + getAnoPubli() +"\n";
		out = out + "Genero = " + getGenero() +"\n";
		out = out + "Sinopse = " + getSinopse() +"\n";
		out = out + "Formato = " + getFormato() +"\n";
		out = out + "Numero total de licencas = " + getLicencas() +"\n";
		out = out + "Formato de Arquivos = " + getFormatoArq() +"\n";
		out = out + "URL = " + getUrl() +"\n";
		out = out + "Requisitos de leitura = " + getRequisitos() +"\n";
		out = out + "Data de disponibilidade = " + getData() +"\n";
		
		return out;
	}

	// Metodos Get and Set 

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public int getLicencas() {
		return licencas;
	}

	public void setLicencas(int licencas) {
		this.licencas = licencas;
	}

	public String getFormatoArq() {
		return formatoArq;
	}

	public void setFormatoArq(String formatoArq) {
		this.formatoArq = formatoArq;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
	

}