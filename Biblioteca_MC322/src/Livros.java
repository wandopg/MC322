/* LAB1
Wanderley Pedroso da Graca Barion RA: 225790
Yuri Rocha Cunha RA: 250570
*/

public class Livros {

	private String titulo;
	private String autor;
	private int paginas;
	private int tombo;

	// Metodo construtor

	public Livros(String titulo, String autor, int paginas, int tombo) {

		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.tombo = tombo;
	}
		
	// Outros metodos
		
	public String toString() {
		String out = "Titulo: "+getTitulo()+"\n";
		out = out + "Autor = "+getAutor()+"\n";
		out = out + "Numero de paginas = "+getPaginas()+"\n";
		out = out + "Tombo = "+getTombo()+"\n";
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
	
	//Tombo
	public int getTombo() {
		return tombo;
	}
		
	public void setTombo(int tombo) {
		this.tombo = tombo;
	}	

}