package materiais;

public class LivroFisico extends ItemMultimidia {

	private int paginas;
	private int tombo;
	
	// Metodo construtor

	public LivroFisico(String titulo, String autor, int paginas, int tombo) {
		super(autor,titulo);
		this.paginas = paginas;
		this.tombo = tombo;
	}
		
	// Outros metodos
		
	public String toString() {
		String out = "Titulo = "+getTitulo()+"\n";
		out = out + "Autor = "+getAutor()+"\n";
		out = out + "Numero de paginas = "+getPaginas()+"\n";
		out = out + "Tombo = "+getTombo()+"\n";
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
	public int getTombo() {
		return tombo;
	}
		
	public void setTombo(int tombo) {
		this.tombo = tombo;
	}	

}