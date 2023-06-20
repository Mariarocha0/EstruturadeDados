package Marco2.Atividade15;
import java.util.LinkedList;
import java.util.Queue;

public class ABB {
    private Noh raiz;

    public boolean estaVazia() {
        return this.raiz == null;
    }

    public void adiciona(int chave) {
        if (estaVazia()) {
            this.raiz = new Noh(chave);
            return;
        }
        adiciona(this.raiz, chave);
    }

    private void adiciona(Noh noh, int element) {
        if (element < noh.getValor()) {
            if (noh.getEsquerda() == null) {
                Noh aux = new Noh(element);
                noh.setEsquerda(aux);
                aux.setPai(noh);
                return;
            }
            adiciona(noh.getEsquerda(), element);
        } else {
            if (noh.getDireita() == null) {
                Noh aux = new Noh(element);
                noh.setDireita(aux);
                aux.setPai(noh);
                return;
            }
            adiciona(noh.getDireita(), element);
        }
    }

    public void remover(int chave) {
        raiz = removerNo(raiz, chave);
    }

    private Noh removerNo(Noh no, int chave) {
        if (no == null)
            return null;

        if (chave < no.getValor())
            no.setEsquerda(removerNo(no.getEsquerda(), chave));
        else if (chave > no.getValor())
            no.setDireita(removerNo(no.getDireita(), chave));
        else {
            // Caso 1: Nó é uma folha
            if (no.getEsquerda() == null && no.getDireita() == null)
                return null;
            // Caso 2: Nó possui apenas um filho
            else if (no.getEsquerda() == null)
                return no.getDireita();
            else if (no.getDireita() == null)
                return no.getEsquerda();
            // Caso 3: Nó possui dois filhos
            else {
                Noh sucessor = encontrarSucessor(no.getDireita());
                no.setValor(sucessor.getValor());
                no.setDireita(removerNo(no.getDireita(), sucessor.getValor()));
            }
        }
        return no;
    }

    private Noh encontrarSucessor(Noh no) {
        while (no.getEsquerda() != null)
            no = no.getEsquerda();
        return no;
    }

    public Noh buscaIter(int element) {
        Noh aux = this.raiz;
        while (aux != null) {
            if (aux.getValor() == element)
                return aux;
            if (element < aux.getValor())
                aux = aux.getEsquerda();
            else if (element > aux.getValor())
                aux = aux.getDireita();
        }
        return null;
    }

    public Noh buscarRec(int chave) {
        return buscar(raiz, chave);
    }

    private Noh buscar(Noh noh, int chave) {
        if (noh == null || noh.getValor() == chave)
            return noh;

        if (chave < noh.getValor())
            return buscar(noh.getEsquerda(), chave);
        else
            return buscar(noh.getDireita(), chave);
    }

    public void imprimir_preOrdem() {
        preOrdem(this.raiz);
    }

    private void preOrdem(Noh node) {
        if (node != null) {
            System.out.print(node.getValor() + " ");
            preOrdem(node.getEsquerda());
            preOrdem(node.getDireita());
        }
    }

    public void imprimeEmOrdem() {
        emOrdem(this.raiz);
    }

    private void emOrdem(Noh node) {
        if (node != null) {
            emOrdem(node.getEsquerda());
            System.out.print(node.getValor() + " ");
            emOrdem(node.getDireita());
        }
    }

    public void imprimirPosOrdem() {
        posOrdem(this.raiz);
    }

    private void posOrdem(Noh node) {
        if (node != null) {
            posOrdem(node.getEsquerda());
            posOrdem(node.getDireita());
            System.out.print(node.getValor() + " ");
        }
    }

    public void imprimirLargura() {
        if (raiz == null) {
            System.out.println("Árvore vazia.");
            return;
        }
        Queue<Noh> fila = new LinkedList<>();
        fila.add(raiz);
        while (!((ABB) fila).estaVazia()) {
            Noh no = fila.poll();
            System.out.print(no.getValor() + " ");

            if (no.getEsquerda() != null)
                fila.add(no.getEsquerda());
            if (no.getDireita() != null)
                fila.add(no.getDireita());
        }
    }
}


