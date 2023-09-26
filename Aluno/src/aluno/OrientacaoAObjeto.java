package aluno;

public class OrientacaoAObjeto {

	public static class Estudante{
	private String nome;
	private int matricula;
	private double media;
	
	public Estudante(String nome, int matricula, double media) {
		this.nome = nome;
		this.matricula = matricula;
		this.media = media;
	}
	
	}
	public static void main(String[] args) {
		
		Estudante aluno = new Estudante("Felipe", 123456, 9.5);
		
		String[] nomeAluno= {"Felipe", "Thiago", "Melyssa"};
		int[] matriculaAluno = {123456, 654321, 987654};
		double[] mediaAluno = {9.5, 10, 9.5};
		
		System.out.println("O nome do aluno é: " + nomeAluno[1]);
		System.out.println("A matrícula do aluno é: " + matriculaAluno[1]);
		System.out.println("A média do aluno é: " + mediaAluno[1]);
		
		System.out.println("O nome do aluno é: " + aluno.nome);
		System.out.println("A matrícula do aluno é: " + aluno.matricula);
		System.out.println("A média do aluno é: " + aluno.media);

	}

}
