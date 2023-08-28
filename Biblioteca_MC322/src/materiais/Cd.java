package materiais;

public class Cd extends ItemMultimidia {

	private int faixas;
	private int duracao;
	
	// Metodo construtor

	public Cd(String titulo, String autor, int faixas, int duracao) {
		super(autor,titulo);
		this.faixas = faixas;
		this.duracao = duracao;
	}
		
	// Outros metodos
		
	public String toString() {
		String out = "Titulo = "+getTitulo()+"\n";
		out = out + "Autor = "+getAutor()+"\n";
		out = out + "Numero de faixas = "+getFaixas()+"\n";
		out = out + "Duracao = "+getDuracao()+"min."+"\n";
		return out;
	}
	
	// Metodos Get and Set 
		
	//Paginas
	public int getFaixas() {
		return faixas;
	}
		
	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}
	
	//Tombo
	public int getDuracao() {
		return duracao;
	}
		
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}	

}