package materiais;


public class ItemMultimidia {

	protected String titulo;
	protected String autor;
	

	// Metodo construtor

	public ItemMultimidia(String autor, String titulo) {

		this.titulo = titulo;
		this.autor = autor;
<<<<<<< HEAD
=======
		this.paginas = paginas;
		this.tombo = tombo;
		
>>>>>>> refs/remotes/origin/master
	}
		
	// Outros metodos
		
	public String toString() {
		String out = "Titulo: "+getTitulo()+"\n";
		out = out + "Autor = "+getAutor()+"\n";
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
}