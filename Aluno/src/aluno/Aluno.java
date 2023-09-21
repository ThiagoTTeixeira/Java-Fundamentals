package aluno;

public class Aluno {
	private String nome;
	private int identificacao;
	private String curso;
	private double media;
	public final int CFP = 113;
	
	public void definirNome(String nome) {
		this.nome = nome;
	}
	
	public String obterNome() {
		return nome;
	}
}
