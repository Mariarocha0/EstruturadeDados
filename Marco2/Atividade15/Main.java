package Marco2.Atividade15;
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

        abb.remover(30);
        abb.remover(50);

        System.out.println("Árvore impressa pré-ordem:");
        abb.imprimir_preOrdem();
        System.out.println("\n");

        System.out.println("Árvore impressa em ordem:");
        abb.imprimeEmOrdem();
        System.out.println("\n");

        System.out.println("Árvore impressa pós-ordem:");
        abb.imprimirPosOrdem();
        System.out.println("\n");

        System.out.println("Árvore impressa em largura:");
        abb.imprimirLargura();
        System.out.println("\n");

        int[] chaves = { 20, 30 };
        for(int chave : chaves) {
            Noh busca = abb.buscaIter(chave);
            if (busca != null)
                System.out.println("Chave " + chave + " encontrada na árvore com busca Iterativa.");
            else
                System.out.println("Chave " + chave + " não encontrada na árvore com busca Iterativa.");
        }

        for(int chave : chaves) {
            Noh busca = abb.buscarRec(chave);
            if (busca != null)
                System.out.println("Chave " + chave + " encontrada na árvore com busca Recursiva.");
            else
                System.out.println("Chave " + chave + " não encontrada na árvore com busca Recursiva.");
        }
    }
}