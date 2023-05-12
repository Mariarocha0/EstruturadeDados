package Marco1.Atividade3;

public class Main {
    public static void main(String[] args) {

        IVetor vetAlunos = new VetorAluno();
        Aluno estudante1 = new Aluno("Kleber", 20, 6);
        Aluno estudante2 = new Aluno("Joana", 22, 8);
        Aluno estudante3 = new Aluno("Gabriele", 19, 10);

        vetAlunos.acrescenta(estudante1);
        vetAlunos.acrescenta(estudante2);
        vetAlunos.acrescenta(estudante3);

        System.out.println(vetAlunos.tamanho());

        System.out.println(vetAlunos.contem(estudante2));

        vetAlunos.cheio();

        vetAlunos.remove(estudante1);

        System.out.println(vetAlunos.contem(estudante1));

    }
}
