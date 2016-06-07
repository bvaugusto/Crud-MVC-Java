package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Dao_Aluno {
	
	private File arquivo;
	
	public int gravarAluno(Aluno aluno){
		int resposta = 0;
		
		try {
			arquivo = new File("arquivo.txt");
			
			FileWriter fw = new FileWriter(arquivo, true);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(aluno.nome+";"+aluno.ra+";"+aluno.tel+";"+Integer.toString(aluno.idade));
			
			bw.newLine();
			
			bw.close();
			fw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		return resposta;
	}
	
	public List<Aluno> ListarAlunos(){
		List<Aluno> listarAlunos = new ArrayList<Aluno>();
		
		Aluno aluno;
		
		try {
			arquivo = new File("arquivo.txt");
			
			FileReader fr = new FileReader(arquivo);
			
			BufferedReader br = new BufferedReader(fr);
			
			while (br.ready()) {
				String linha = br.readLine();
				aluno = new Aluno();
				
				String campos[] = linha.split(";");
				
				aluno.nome = campos[0];
				aluno.ra = campos[1];
				aluno.tel = campos[2];
				aluno.idade = Integer.parseInt(campos[3]);
				
				listarAlunos.add(aluno);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return listarAlunos;
	}

}
