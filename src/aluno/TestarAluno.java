package aluno;

public class TestarAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno serHumano1 = new Aluno();
		serHumano1.definirNome("Thiago");
		Aluno serHumano2 = new Aluno();	
		serHumano2.definirNome("Astolfo");
		Curintiano serHumano3 = new Curintiano("Vai, curintia");
		serHumano3.nome = "Thiago";
		Curintiano serHumano4 = new Curintiano("");
		serHumano4.definirLema("ai q n sei oq");
		
		System.out.println(serHumano1.obterNome());
		System.out.println(serHumano2.obterNome());
		System.out.println(serHumano3.dizerLema());
		System.out.println(serHumano4.dizerLema());

	}

}
