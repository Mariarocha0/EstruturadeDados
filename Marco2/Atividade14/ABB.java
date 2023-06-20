package Marco2.Atividade14;
public class ABB {
    private Noh raiz;

    public boolean estaVazia() {
        return this.raiz == null;
    }

    public void adiciona(int chave) {
        if(estaVazia()) {
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
                noh.setDir(aux);
                aux.setPai(noh);
                return;
            }
            adiciona(noh.getDireita(), element);
        }
    }

    public Noh buscar(int chave) {
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

    public void imprimir() {
        imprimir(raiz);
    }

    private void imprimir(Noh no) {
        if (no != null) {
            imprimir(no.getEsquerda());
            System.out.print(no.getValor() + " ");
            imprimir(no.getDireita());
        }
    }
}
