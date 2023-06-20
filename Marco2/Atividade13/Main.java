package Marco2.Atividade13;

public class Main {
    public static void main(String[] args){
        VetorHash maphash = new VetorHash(10);
        Aluno aluno1 = new Aluno("Maria", 221010055);
        Aluno aluno2 = new Aluno("Bianca", 221010050);
        Aluno aluno3 = new Aluno("Eduardo", 221010478);
        Aluno aluno4 = new Aluno("Pietra", 221010456);

        maphash.colocar(aluno1.getMatricula(), aluno1);
        maphash.colocar(aluno2.getMatricula(), aluno2);
        maphash.colocar(aluno3.getMatricula(), aluno3);
        maphash.colocar(aluno4.getMatricula(), aluno4);
        System.out.println("Vetor:");
        maphash.imprimeAlunos();
        maphash.inverteOrdem();
        System.out.println("Vetor invertido:");
        maphash.imprimeAlunos();
    }
}
