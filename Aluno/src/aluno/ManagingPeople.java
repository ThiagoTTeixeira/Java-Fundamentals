package aluno;

public class ManagingPeople {

	public static void main(String[] args) {
		Person p1 = new Person("Thiago", 48);
		Person p2 = new Person("Jasson", 9);
		
		if(p1.getIdade() == p2.getIdade()) {
			System.out.println(p1.getNome() + "tem a mesma idade que " + p2.getNome());
		} else {
			System.out.println(p1.getNome() + " Não tem a mesma idade que " + p2.getNome());
		}
	}

}
