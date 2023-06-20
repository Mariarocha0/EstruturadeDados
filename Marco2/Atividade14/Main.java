package Marco2.Atividade14;
public class Main {
    public static void main(String[] args) {
        ABB abb = new ABB();
        abb.adiciona(50);
        abb.adiciona(30);
        abb.adiciona(20);
        abb.adiciona(40);
        abb.adiciona(70);
        abb.adiciona(60);
        abb.adiciona(80);

        System.out.println("Árvore impressa em ordem:");
        abb.imprimir();
        System.out.println("\n");

        int[] chaves = { 20, 30, 35, 45 };
        for(int chave : chaves) {
            Noh busca = abb.buscar(chave);
            if (busca != null)
                System.out.println("Chave " + chave + " encontrada na árvore.");
            else
                System.out.println("Chave " + chave + " não encontrada na árvore.");
        }
    }
}