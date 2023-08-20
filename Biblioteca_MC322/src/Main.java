
import materiais.Livros;
import materiais.Teses;
import membros.Funcionarios;
import membros.Usuarios;
import materiais.Periodicos;

/* LAB1
Wanderley Pedroso da Graca Barion RA: 225790
Yuri Rocha Cunha RA: 250570
*/

public class Main {

	public static void main(String[] args) {
	
	//Instanciando objetos
		Livros livro1 = new Livros("Dom Quixote", "Miguel de Cervantes", 250, 1);
		Teses tese1 = new Teses("POO em MC322", "Bruno Cafeo", 375);
		Funcionarios funcionario1 = new Funcionarios("Joao Silva", "Bibliotecario", 001, "123.456.789-12");
		Usuarios usuario1 = new Usuarios("Ana Maria", "Aluno", 00001, "987.654.321-98");
		Periodicos pediodico1= new Periodicos ("News14/08", "Jorge Mendes",100);
	
		
	// impressao dos objetos
		System.out.println("Primeiro livro:\n"+livro1);
		System.out.println("Priemira Tese:\n"+tese1);
		System.out.println("Primeiro funcionário:\n"+funcionario1);
		System.out.println("Primeiro usuário:\n"+usuario1);
		System.out.println("Primeiro periodico:\n"+ pediodico1);
	}
	

}
