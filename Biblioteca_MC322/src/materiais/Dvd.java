package materiais;

public class Dvd extends ItenMultimidia {

	private String elenco;
	private int duracao;
	private int copias;
	private int copiasDisponiveis;
	private String legendasAudios;
	private String conservacao;
	
	// Metodo construtor
	public Dvd(String titulo, String autorOuArtista, String editoraOuGravdora, int anoPubli, String genero,
			String sinopse, String elenco, int duracao, int copias, int copiasDisponiveis, String legendasAudios,
			String conservacao) {
		super(titulo, autorOuArtista, editoraOuGravdora, anoPubli, genero, sinopse);
		this.elenco = elenco;
		this.duracao = duracao;
		this.copias = copias;
		this.copiasDisponiveis = copiasDisponiveis;
		this.legendasAudios = legendasAudios;
		this.conservacao = conservacao;
	}
	
		
	// Outros metodos
		
	public String toString() {
		String out = "Titulo = "+getTitulo()+"\n";
		return out;
	}


	public String getElenco() {
		return elenco;
	}


	public void setElenco(String elenco) {
		this.elenco = elenco;
	}


	public int getDuracao() {
		return duracao;
	}


	public void setDuracao(int duracao) {
		this.duracao = duracao;
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


	public String getLegendasAudios() {
		return legendasAudios;
	}


	public void setLegendasAudios(String legendasAudios) {
		this.legendasAudios = legendasAudios;
	}


	public String getConservacao() {
		return conservacao;
	}


	public void setConservacao(String conservacao) {
		this.conservacao = conservacao;
	}
	
	

	// Metodos Get and Set 
		
	
}