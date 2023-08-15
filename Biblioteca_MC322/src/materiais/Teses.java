package materiais;


public class Teses {

	private String titulo;
	private String autor;
	private int paginas;

	// Metodo construtor

	public Teses(String titulo, String autor, int paginas) {

		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;

	}
		
	// Outros metodos
		
	public String toString() {
		String out = "Titulo: "+getTitulo()+"\n";
		out = out + "Autor = "+getAutor()+"\n";
		out = out + "Numero de paginas = "+getPaginas()+"\n";
		return out;
	}
	
	// Metodos Get and Set 
		
	
	//Titulo
	public String getTitulo() {
		return titulo;
	}
		
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	//Autor
		public String getAutor() {
			return autor;
		}
			
		public void setAutor(String autor) {
			this.autor = autor;
		}
	
	//Paginas
	public int getPaginas() {
		return paginas;
	}
		
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	

}