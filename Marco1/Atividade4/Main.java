package Marco1.Atividade4;

public class Main {
  
    public static void main(String[] args) {

        ILSE vetAlunos = new LSE();
        Aluno estudantes1 = new Aluno("Kleber", 20, 6);
        Aluno estudantes2 = new Aluno("Joana", 22, 8);
        Aluno estudantes3 = new Aluno("Gabriele", 19, 10);

        vetAlunos.insereFim(estudantes1);
        vetAlunos.insereInicio(estudantes2);
        vetAlunos.insereInicio(estudantes3);

        System.out.println(vetAlunos.tamanho());

        System.out.println(vetAlunos.estahVazia());

        vetAlunos.remove(estudantes1);

        System.out.println(vetAlunos.tamanho());

        System.out.println(vetAlunos.imprimeLista());

    }
}
