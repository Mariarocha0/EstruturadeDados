package Marco2.Trabalho;

public class Main {
    public static void main (String[] args){
      
        PilhaVetor pilha3 = new PilhaVetor(50);
        System.out.println("*****************************************************");
        System.out.println("Palavra para teste: reviver");
        System.out.println("Palindromo: " + pilha3.palindromo("reviver"));

        pilha3.estadoPilha();

        System.out.println("*****************************************************");

        LseAlunos listaAlunos = new LseAlunos();
        listaAlunos.adiciona(new Aluno("Pietra", 20));
        listaAlunos.adiciona(new Aluno("Eduardo", 18));
        listaAlunos.adiciona(new Aluno("Maria", 19));
        listaAlunos.adiciona(new Aluno("Bianca", 21));
        listaAlunos.imprimeAlunos();

        System.out.println("Invertendo a lista");
        listaAlunos.inverteOrdem();
        listaAlunos.imprimeAlunos();
    }
}