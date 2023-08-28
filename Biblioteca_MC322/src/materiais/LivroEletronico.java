package materiais;

public class LivroEletronico extends ItemMultimidia {

	private int paginas;
	private String url;
	
	// Metodo construtor

	public LivroEletronico(String titulo, String autor, int paginas, String url) {
		super(autor,titulo);
		this.paginas = paginas;
		this.url = url;
	}
		
	// Outros metodos
		
	public String toString() {
		String out = "Titulo = "+getTitulo()+"\n";
		out = out + "Autor = "+getAutor()+"\n";
		out = out + "Numero de paginas = "+getPaginas()+"\n";
		out = out + "URL = "+getUrl()+"\n";
		return out;
	}
	
	// Metodos Get and Set 
		
	//Paginas
	public int getPaginas() {
		return paginas;
	}
		
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	//Tombo
	public String getUrl() {
		return url;
	}
		
	public void setUrl(String url) {
		this.url = url;
	}	

}