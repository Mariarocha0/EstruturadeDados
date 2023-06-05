package Marco2.Atividade10;

public class Main {
    public static void main(String[] args) {

        Fila fila = new Fila(3);
        fila.insereFila(5);
        fila.insereFila(10);
        fila.insereFila(15);

        System.out.println("Imprimindo fila:");
        fila.imprime();

        System.out.println("Tamanho: " + fila.tamanho());
        System.out.println("Removendo elemento da fila:");
        fila.remove();
        fila.imprime();
        System.out.println("Tamanho: " + fila.tamanho());

    }

}