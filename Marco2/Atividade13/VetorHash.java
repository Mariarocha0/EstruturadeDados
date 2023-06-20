package Marco2.Atividade13;

public class VetorHash {
    private Aluno[] alunos;
    private int totalAlunos = 0;
    
    public VetorHash(int n) {
        this.alunos = new Aluno[n];
    }

    private int hash(int chave) {
        int indice = chave % this.alunos.length;
        while (this.alunos[indice] != null && this.alunos[indice].getMatricula() != chave) {
            indice = (indice + 1) % this.alunos.length;
            if (this.alunos[indice] != null && this.alunos[indice].getMatricula() == chave) {
                return indice;
            }
        }
        return indice;
    }

    public Aluno get(int chave) {
        int hash = hash(chave);
        int indice = hash;
        if (alunos[indice] != null && alunos[indice].getMatricula() == chave) {
            return alunos[indice];
        }
        return null;
    }

    public void colocar(int chave, Aluno valor) {
        int hash = hash(chave);
        int indice = hash;
        alunos[indice] = valor;
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