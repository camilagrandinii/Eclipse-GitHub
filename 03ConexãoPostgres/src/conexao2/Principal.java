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
}
		//Mostrar usuários
		if(opcao==1) {
		
			System.out.println("==== Mostrar Usuários ==== ");
			autores = dao.getAutores();
			for(int i = 0; i < autores.length; i++) {
				System.out.println(autores[i].toString());
			}
		}
		
		//Inserir um elemento na tabela
		if(opcao==2) {
			Autor autor = new Autor(11, "pablo", 20,"Romance");
			if(dao.inserirAutor(autor) == true) {
				System.out.println("Inserção com sucesso -> " + autor.toString());
			}
		}
		
		//Excluir usuário
		if(opcao==3) {
		Autor autor = new Autor(12, "camila", 24, "Poesias");
		dao.excluirAutor(autor.getCodigo());
		}
		
		//Atualizar usuário
		if (opcao==4) {
		Autor autor = new Autor(12, "juliana", 24, "aventura");
		autor.setNome("novo nome");
		dao.atualizarAutor(autor);
		}
		
		if(opcao==5) {
			System.out.print("Saindo do programa...");
		}
				
		dao.close();
	}
}

