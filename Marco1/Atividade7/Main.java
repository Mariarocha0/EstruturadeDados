package Marco1.Atividade7;


public class Main {
    public static void main (String[] args){

     
        Vetor vetor = new Vetor();
        int[] aleatorios = vetor.gerandoAleatorio();

        for (int i = 0; i < aleatorios.length; i++) {
                vetor.adicionar(aleatorios[i]);
                
        }       
      
        long InicioTempoRecursao = System.nanoTime();
        System.out.println("Máximo de recursividade: " + vetor.maxRecursao(aleatorios, 0, aleatorios.length - 1));
        long FimTempoRecursao = System.nanoTime();
        long tempoRecursao = FimTempoRecursao - InicioTempoRecursao;
        System.out.println("Tempo de execução recursividade: " + tempoRecursao + " nanosegundos");

        long InicioTempoIteracao = System.nanoTime();
        System.out.println("Máximo de interatividade: " + vetor.maxIteracao(aleatorios.length));
        long FimTempoItenteracao = System.nanoTime();
        long tempoIteracao = FimTempoItenteracao - InicioTempoIteracao;
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