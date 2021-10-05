package conexao2;
import conexao2.DAO;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DAO dao = new DAO();
		
		dao.conectar();

		int opcao=0;
		
		System.out.print("MENU:\n1)Listar\n2)Inserir\n3)Exluir\n4)Atualizar\n5)Sair");
		opcao = entrada.nextInt();
		//Mostrar usuários do sexo masculino		
		System.out.println("==== Mostrar usuários do sexo masculino === ");
		Livros[] livros = dao.getLivrosMasculinos();
		for(int i = 0; i < livros.length; i++) {
			System.out.println(livros[i].toString());
}
		//Mostrar usuários
		if(opcao==1) {
		
			System.out.println("==== Mostrar Usuários ==== ");
			livros = dao.getLivros();
			for(int i = 0; i < livros.length; i++) {
				System.out.println(livros[i].toString());
			}
		}
		
		//Inserir um elemento na tabela
		if(opcao==2) {
			Livros livro = new Livros(11, "pablo", 20,"Romance");
			if(dao.inserirLivros(livro) == true) {
				System.out.println("Inserção com sucesso -> " + livro.toString());
			}
		}
		
		//Excluir usuário
		if(opcao==3) {
		Livros livro = new Livros(12, "camila", 24, "Poesias");
		dao.excluirLivros(livro.getCodigo());
		}
		
		//Atualizar usuário
		if (opcao==4) {
		Livros livro = new Livros(12, "juliana", 24, "aventura");
		livro.setNome("novo nome");
		dao.atualizarLivros(livro);
		}
		
		if(opcao==5) {
			System.out.print("Saindo do programa...");
		}
				
		dao.close();
	}
}

