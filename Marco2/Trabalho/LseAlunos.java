package Marco2.Trabalho;

public class LseAlunos {
    
    private Aluno[] alunos;
    private int totalAlunos = 0;


    public LseAlunos(){
        alunos = new Aluno[4];
    }

    public void adiciona(Object object){
        if (totalAlunos == alunos.length){
            return;
        }

        this.alunos[this.totalAlunos] = (Aluno) object;
        this.totalAlunos++;
    }


    public boolean contem(Aluno aluno){
        for(int i = 0; i < this.totalAlunos; i++){
            if(this.alunos[i].equals(aluno)){
                return true;
            }
        }
        return false;
    }

    public int tamanho(){
        return this.totalAlunos;
    }

    public void inverteOrdem() {
        if (totalAlunos <= 1) {
            return;
        }
    
        Aluno[] alunosInvertidos = new Aluno[totalAlunos];
        int index = totalAlunos - 1;
    
       
        for (int i = 0; i < totalAlunos; i++) {
            alunosInvertidos[index] = alunos[i];
            index--;
        }
        alunos = alunosInvertidos;
    }
    
    public void imprimeAlunos() {
        for (int i = 0; i < this.totalAlunos; i++) {
            System.out.println(this.alunos[i]);
        }
    }

    
}