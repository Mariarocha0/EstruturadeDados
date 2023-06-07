package Marco2.Trabalho;

public class Aluno {

    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    @Override
    public String toString() {
        return "Aluno: " + nome + ", Idade: " + idade;
    }
   
}