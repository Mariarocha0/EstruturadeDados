package Marco1.Atividade2;

public class Vetor {

    private Aluno[] alunos;
    private int quantidadeAlunos = 0;

    public Vetor() {
        alunos = new Aluno[4];
    }

    public void acrescenta(Aluno aluno) {
        if (quantidadeAlunos == alunos.length) {
            return;
        }

        this.alunos[this.quantidadeAlunos] = aluno;
        this.quantidadeAlunos++;
    }

    public int tamanho() {
        return this.quantidadeAlunos;
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < this.quantidadeAlunos; i++) {
            if (this.alunos[i].equals(aluno)) {
                return true;
            }
        }
        return false;

    }
}
