package aluno;

public class Person {
	private String nome;
	private int idade;
	
	public Person(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
