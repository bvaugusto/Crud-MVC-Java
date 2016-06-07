package view;

import java.util.List;
import java.util.Iterator;
import java.util.Scanner;

import model.Aluno;
import controller.Ne_Aluno;

public class Tela_Aluno {

	public Tela_Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void mensagem(int codigo){
		switch (codigo) {
		case (0):
			System.out.println("Aluno cadastrado com sucesso!");
			break;
			
		case (-1):
			System.out.println("Aluno não cadastrado com sucesso!");
			break;
		}
		
	}
	
	public void cadastrar(){
		int retorno;
		
		Aluno aluno = new Aluno();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno!");
		aluno.nome = s.next();
		
		System.out.println("Digite o ra do aluno!");
		aluno.ra = s.next();
		
		System.out.println("Digite o telefone do aluno!");
		aluno.tel = s.next();
		
		System.out.println("Digite o idade do aluno!");
		aluno.idade = s.nextInt();
		
		Ne_Aluno neAluno = new Ne_Aluno();
		retorno = neAluno.VerificarIdadeMinima(aluno);
		mensagem(retorno);
	}
	
	public void listar(){
		
		List<Aluno> listarAluno;
		Ne_Aluno neAluno = new Ne_Aluno();
		
		listarAluno = neAluno.ListarAlunos();
		
		for (Iterator iterator = listarAluno.iterator(); iterator.hasNext();) {
			//type type = (type) iterator.next();
			
			Aluno aluno = (Aluno) iterator.next();
			System.out.println(aluno);
			
		}
	}
	
	

}
