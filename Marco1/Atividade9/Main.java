package Marco1.Atividade9;

public class Main {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);
        vetor.gerandoAleatorio();

        long Inicio = System.nanoTime();
        vetor.bubble_sort();
        long TempoPercorrido = System.nanoTime() - Inicio;

        System.out.println("Tempo de execução: " + TempoPercorrido + " nanosegundos no Bubble Sort");

        long Inicio2 = System.nanoTime();
        vetor.selection_sort();
        long TempoPercorrido2 = System.nanoTime() - Inicio2;

        System.out.println("Tempo de execução: " + TempoPercorrido2 + " nanosegundos no Selection Sort");

        long Inicio3 = System.nanoTime();
        vetor.insertion_sort();
        long TempoPercorrido3 = System.nanoTime() - Inicio3;

        System.out.println("Tempo de execução: " + TempoPercorrido3 + " nanosegundos no Insertion Sort");


 
        
    }
    
}