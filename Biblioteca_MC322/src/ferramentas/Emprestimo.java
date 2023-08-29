package ferramentas;
import materiais.ItenMultimidia;

public class Emprestimo {
	
	private ItenMultimidia item;
	private String dataemprestimo;
	private String datadevolucao;
	
	public Emprestimo(String emprestimo, String devolucao) {

		this.dataemprestimo = emprestimo;
		this.datadevolucao = devolucao;

	}

	public ItenMultimidia getItem() {
		return item;
	}

	public void setItem(ItenMultimidia item) {
		this.item = item;
	}

	public String getDataemprestimo() {
		return dataemprestimo;
	}

	public void setDataemprestimo(String dataemprestimo) {
		this.dataemprestimo = dataemprestimo;
	}

	public String getDatadevolucao() {
		return datadevolucao;
	}

	public void setDatadevolucao(String datadevolucao) {
		this.datadevolucao = datadevolucao;
	}
	
	
	
	
}
