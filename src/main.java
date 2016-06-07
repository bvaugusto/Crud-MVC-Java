import java.util.Scanner;

import view.Tela_Aluno;


public class main {

	public static void main(String[] args) {
		int opcao;

		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Menu Principal");
			System.out.println("1 - Cadastro");
			System.out.println("2 - Lista");
			System.out.println("3 - Sair");

			System.out.print("Escolha a opção: ");
			opcao = s.nextInt();

			Tela_Aluno aluno = new Tela_Aluno();

			switch (opcao) {
			case (1):
				aluno.cadastrar();

				break;

			case (2):
				aluno.listar();

				break;

			case (3):
				System.out.println("Fui!");

				break;

			default:
				System.out.println("Opção inválida!");
				break;
			}
		} while (opcao!=3);


	}

}
