package aluno;

public class CalculoTriangulo {

	public static void main(String[] args) {
		double area;
		AreaDoTriangulo a1 = new AreaDoTriangulo(4, 8);
		area = a1.getArea();
		System.out.println(area);
		
		AreaDoTriangulo a2 = new AreaDoTriangulo(9, 40);
		area = a2.getArea();
		System.out.println(area);

	}

}
