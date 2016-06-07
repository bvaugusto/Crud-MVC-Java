package controller;

import java.util.List;

import model.Aluno;
import model.Dao_Aluno;

public class Ne_Aluno {
	
	public int VerificarIdadeMinima(Aluno aluno){
		int resposta = 0;
		
		if(aluno.idade < 18){
			resposta = -1;
		}else{
			Dao_Aluno daoAluno = new Dao_Aluno();
			daoAluno.gravarAluno(aluno);
		}
		return resposta;
	}
	
	public List<Aluno> ListarAlunos(){
		Dao_Aluno daoAluno = new Dao_Aluno();
		return daoAluno.ListarAlunos();
	}

}
