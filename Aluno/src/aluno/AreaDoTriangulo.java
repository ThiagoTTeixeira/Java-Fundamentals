package aluno;

public class AreaDoTriangulo {
	private double base;
	private double altura;
	private double area;
	
	public AreaDoTriangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double getArea() {
		area = base * altura / 2;
		return area;
	}
}
