package Marco1.Atividade6;

public class Main {
    
    public static void main(String[] args) {

        ILDE vetAlunos = new LDE();

        Aluno estudantes1 = new Aluno("Kleber", 20, 6);
        Aluno estudantes2 = new Aluno("Joana", 22, 8);
        Aluno estudantes3 = new Aluno("Gabriele", 19, 10);
    
        System.out.println(vetAlunos.tamanho());
    
        System.out.println(vetAlunos.estahVazia());
    
        vetAlunos.remove(estudantes1);
    
        System.out.println(vetAlunos.tamanho());
    
        System.out.println(vetAlunos.imprimeListaInicio());
        System.out.println(vetAlunos.imprimeListaFim());
    
    }
}