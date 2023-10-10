package aluno;

public class calculaOnibus {

	public static void main(String[] args) {
		Excursao excursao = new Excursao();
		excursao.calcularBusEVans(100);
		 System.out.println("O numero de onibus é: " + excursao.getNumOnibus());
		 System.out.println("O numero de pessoas em bans é: " + excursao.getNumPessVans());

	}

}
