package materiais;

public class Dvd extends ItemMultimidia {

	private int duracao;
	
	// Metodo construtor

	public Dvd(String titulo, String autor, int duracao) {
		super(autor,titulo);
		this.duracao = duracao;
	}
		
	// Outros metodos
		
	public String toString() {
		String out = "Titulo = "+getTitulo()+"\n";
		out = out + "Autor = "+getAutor()+"\n";
		out = out + "Duracao = "+getDuracao()+"min."+"\n";
		return out;
	}
	
	// Metodos Get and Set 
		
	//Paginas
	public int getDuracao() {
		return duracao;
	}
		
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

}