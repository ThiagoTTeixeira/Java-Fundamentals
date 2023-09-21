package aluno;

public class TestarTipo {

	static double x;
	static int d;
	
	public static void main(String[] args) {
		x = 5;
		d = 10;
		System.out.println(x);
		func();
	}
	public static void func() {
		System.out.println("Valor D antes " + d);
		x = d++;
		System.out.println("Valor D depois "+d);
		System.out.println(x);
	}
}
