
import materiais.LivroFisico;
import materiais.LivroEletronico;
import materiais.Cd;
import materiais.Dvd;
import usuarios.Funcionarios;
import usuarios.EstudantesGraduacao;


/* LAB4
Wanderley Pedroso da Graca Barion RA: 225790
Yuri Rocha Cunha RA: 250570
*/

public class Main {

	public static void main(String[] args) {
	
	//Instanciando objetos
		LivroFisico livrofisico1 = new LivroFisico("Dom Quixote", "Miguel de Cervantes", "Editora Unicamp", 2005, "Aventura", "A história relata os feitos de um ingênuo e fidalgo cavaleiro medieval, Dom Quixote. Ao lado dele, estão seu cavalo Rocinante e seu fiel amigo e escudeiro: Sancho Pança. Ávido leitor dos romances de cavalaria, Dom Quixote cria seu próprio mundo ao se lançar em diversas aventuras.", 123, 1, 5, 5, "E1-P1", "Novo");
		/*LivroEletronico livroeletronico1 = new LivroEletronico("Dom Quixote", "Miguel de Cervantes", 250, "www.livro1.com.br");
		Funcionarios funcionario1 = new Funcionarios("Joao Silva", "Bibliotecario", 001, "123.456.789-12");
		EstudantesGraduacao estudante1 = new EstudantesGraduacao("Joao Silva", 123456, "123.456.789-12");
		Cd cd1 = new Cd("Dom Quixote - Audiolivro", "Miguel de Cervantes", 15, 120);
		Dvd dvd1 = new Dvd("Dom Quixote", "Miguel de Cervantes", 133);
		*/
		
	// impressao dos objetos
		System.out.println("Primeiro livro fisico:\n"+livrofisico1);
		//System.out.println("Primeiro livro eletronico:\n"+livroeletronico1);
		//System.out.println("Primeiro cd:\n"+cd1);
		//System.out.println("Primeiro dvd:\n"+dvd1);
		//System.out.println("Primeiro estudante:\n"+estudante1);
		//System.out.println("Primeiro funcionário:\n"+funcionario1);
	}
	

}
