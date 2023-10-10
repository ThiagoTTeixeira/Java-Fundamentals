package aluno;

public class Excursao {
	private int numOnibus;
	private int numPessVans;
	
	public int getNumOnibus() {
	return numOnibus;	
	}
	
	public int getNumPessVans() {
		return numPessVans;
	}
	
	public void calcularBusEVans(int numPess) {
		numOnibus = numPess / 45;
		numPessVans = numPess % 45;
	}
}
