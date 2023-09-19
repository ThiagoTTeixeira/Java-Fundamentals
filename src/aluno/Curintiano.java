package aluno;

public class Curintiano {
	public String nome;
	private String lema;
	
	public Curintiano(String lema) {
		this.lema = lema;
	}
	
	public void definirLema(String lema) {
		this.lema = lema;
	}
	
	public String dizerLema() {
		return lema;
	}
}
