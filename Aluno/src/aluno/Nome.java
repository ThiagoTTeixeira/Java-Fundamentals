package aluno;

public class Nome {
    public String NomeCompleto(String nome, String sobrenome) {
        return nome+" "+sobrenome;
    }
    public static void main(String[] args){
        Nome n1 = new Nome();
        System.out.println(n1.NomeCompleto("Maria", "Silva"));
    }

}
