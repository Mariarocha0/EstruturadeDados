package Marco2.Atividade11;
public class Main {
    public static void main(String[] args) {

        Fila fila = new Fila();
        fila.insereFila("Gabi");
        fila.insereFila("Gian");
        fila.insereFila("Pietra");
        fila.insereFila("Eduardo");
        fila.insereFila("Bianca");


        

        System.out.println("Imprimindo fila:");
        fila.imprime();

        System.out.println("Tamanho: " + fila.tamanho());
        System.out.println("Removendo elemento da fila:");
        fila.remove();
        fila.imprime();
        System.out.println("Tamanho: " + fila.tamanho());


    }

}