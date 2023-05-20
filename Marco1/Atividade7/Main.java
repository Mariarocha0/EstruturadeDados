package Marco1.Atividade7;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(1000);
        vetor.gerandoAleatorio();

        long inicioTempoRecursao = System.nanoTime();
        System.out.println("Máximo de recursividade: " + (vetor.maxRecursao(0, 999)));
        long fimTempoRecursao = System.nanoTime();
        long tempoRecursao = fimTempoRecursao - inicioTempoRecursao;
        System.out.println("Tempo de execução recursividade: " + tempoRecursao + " nanosegundos");

        long inicioTempoIteracao = System.nanoTime();
        System.out.println("Máximo de interatividade: " +(vetor.maxIteracao()));
        long fimTempoIteracao = System.nanoTime();
        long tempoIteracao = fimTempoIteracao - inicioTempoIteracao;
        System.out.println("Tempo de execução iteratividade: " + tempoIteracao + " nanosegundos");

        if (tempoRecursao > tempoIteracao) {
            System.out.println("Iterativo é mais rápido");
            System.out.println("Espaço de tempo: " + (tempoRecursao - tempoIteracao) + " nanosegundos");
        } else {
            System.out.println("Recursivo é mais rápido");
            System.out.println("Espaço de tempo: " + (tempoIteracao - tempoRecursao) + " nanosegundos");
        }
    }
}
