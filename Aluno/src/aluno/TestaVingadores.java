package aluno;

public class TestaVingadores{
    public static void main(String[] args){
        Vingadores HomemdeFerro = new Vingadores();
        HomemdeFerro.nome = "Tony Stark";
        HomemdeFerro.idade = 34;
        HomemdeFerro.peso = 88;
        HomemdeFerro.altura = 1.92;
        HomemdeFerro.poder = "Dinheiro";
        HomemdeFerro.uniforme = "Mark III";

        Vingadores HomemAranha = new Vingadores();
        HomemAranha.nome = "Peter Parker";
        HomemAranha.idade = 16;
        HomemAranha.peso = 88.8;
        HomemAranha.altura = 1.80;
        HomemAranha.poder = "Aranha";
        HomemAranha.uniforme = "Roupa de latex";

        System.out.println(HomemAranha.peso);
        HomemAranha.salvar();

    }
}