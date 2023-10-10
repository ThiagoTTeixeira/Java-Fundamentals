package aluno;
import java.util.Scanner;

public class Escansor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com seu nome: ");
		String nome = entrada.next();
		System.out.println(nome);
	}

}
