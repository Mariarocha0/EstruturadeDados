package Marco2.Atividade11;

public class Fila implements IFila {

    private Noh inicio;
    private Noh fim;

    public Fila() { 
        this.inicio = null;
        this.fim = null;
    }

    public boolean estaVazia() {
        return (inicio == null);
    }

    public boolean insereFila(Object info) { 
        Noh novo = new Noh(info);
        if (this.estaVazia()) {
            inicio = novo;
        } else
            fim.setProximo(novo);
        fim = novo;
        return true;
    }

    public boolean remove() { // remove
        if (!estaVazia()) {
            if (inicio == fim) {
                inicio = null;
                fim = null;
            } else
                inicio = inicio.getProximo();
            return true;
        }
        return false;
    }

    public void imprime() { 
        if (!estaVazia()) {
            Noh aux = inicio;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProximo();
            }
        }
    }

    public int tamanho() {
        int cont = 0;
        if (!estaVazia()) {
            Noh aux = inicio;
            while (aux != null) {
                cont++;
                aux = aux.getProximo();
            }
        }
        return cont;
    }

}