package materiais;

public class Dvd extends ItenMultimidia {

	private String elenco;
	private int duracao;
	private int copias;
	private int copiasDisponiveis;
	private String legendasAudios;
	private String estado;
	
	// Metodo construtor
	public Dvd(String titulo, String autorOuArtista, String editoraOuGravdora, int anoPubli, String genero,
			String sinopse, String elenco, int duracao, int copias, int copiasDisponiveis, String legendasAudios,
			String estado) {
		super(titulo, autorOuArtista, editoraOuGravdora, anoPubli, genero, sinopse);
		this.elenco = elenco;
		this.duracao = duracao;
		this.copias = copias;
		this.copiasDisponiveis = copiasDisponiveis;
		this.legendasAudios = legendasAudios;
		this.estado = estado;
	}
	
	
	public String toString() {
		String out = "Titulo: "+getTitulo()+"\n";
		out = out + "Autor = " + getAutorOuArtista() +"\n";
		out = out + "Editor ou Gravadora = " + getEditoraOuGravdora() +"\n";
		out = out + "Ano de publicacao = " + getAnoPubli() +"\n";
		out = out + "Genero = " + getGenero() +"\n";
		out = out + "Sinopse = " + getSinopse() +"\n";
		out = out + "Elenco = " + getElenco() +"\n";
		out = out + "Duração = " + getDuracao() +"\n";
		out = out + "Numero de copias disponiveis = " + getCopias() +"\n";
		out = out + "Numeros de copias disponíveis = " + getCopiasDisponiveis() +"\n";
		out = out + "Legendas de Áudio Disponíveis = " + getLegendasAudios() +"\n";
		out = out + "Estado de conservacao = " + getEstado() +"\n";

		
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


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

	// Metodos Get and Set 
		
	
}