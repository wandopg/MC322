/* LAB1
Wanderley Pedroso da Graca Barion RA: 225790
Yuri Rocha Cunha RA: 250570
*/

public class Funcionarios {

	private String nome;
	private String cargo;
	private int id;
	private String cpf;

	// Metodo construtor

	public Funcionarios(String nome, String cargo, int id, String cpf) {

		this.nome = nome;
		this.cargo = cargo;
		this.id = id;
		this.cpf = cpf;

	}
	
	// Outros metodos
		
	public String toString() {
		String out = "Nome: "+getNome()+"\n";
		out = out + "Cargo = "+getCargo()+"\n";
		out = out + "ID = "+getId()+"\n";
		out = out + "CPF = "+getCpf()+"\n";
		return out;
	}
		
	// Metodos Get and Set 
			
		
	//Nome
	public String getNome() {
		return nome;
	}
			
	public void setNome(String nome) {
		this.nome = nome;
	}
		
	//Cargo
		public String getCargo() {
			return cargo;
		}
				
		public void setCargo(String cargo) {
			this.cargo = cargo;
		}
		
	//ID
	public int getId() {
		return id;
	}
			
	public void setId(int id) {
		this.id = id;
	}
		
	//CPF
	public String getCpf() {
		return cpf;
	}
			
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	

}