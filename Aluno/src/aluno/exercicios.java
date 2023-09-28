package aluno;

import java.util.Scanner;

public class exercicios {

	public static void main(String[] args) {
		double gallons;
		double liters=0;
		double c = 3.785;
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Digite o numero de galões");
			gallons = in.nextDouble();
			liters = (gallons * c);
			System.out.println(gallons+" gallons equals "+liters+" liters");
		}

	}

}
