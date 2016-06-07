package model;

public class Aluno {
	public String nome;
	public String ra;
	public String tel;
	public int idade;
	
	
	public Aluno() {}
	
	public Aluno(String nome, String ra, String tel, int idade) {
		this.nome = nome;
		this.ra = ra;
		this.tel = tel;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	

}
