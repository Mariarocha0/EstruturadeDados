package Prova1.QuestãoP9;

public class LDE {
    private Noh inicio;
    
    public LDE (){
        this.inicio = null;
    }
    
    public void addinicio(Object info) {
        Noh novoNoh = new Noh(info);
        
        if (inicio == null)
            inicio = novoNoh;
        else {
        novoNoh.setProximo(inicio);
        inicio = novoNoh;
        }
    }
    
    public void insereFim(Object info) {
        Noh novoNoh = new Noh(info);
        Noh aux = inicio;
        
        if (inicio == null)
            inicio = novoNoh;
        else {
            while (aux.getProximo() != null)
                aux = aux.getProximo();
            aux.setProximo(novoNoh);
        }
    }
    
    public boolean estaVazia() {
        return inicio == null;
    }
    
    public boolean remove(Object info) {
        Noh atual;
        Noh anterior = null;
        atual = inicio;
        

        while (atual!=null && atual.getInfo() != info){
            anterior = atual;
            atual = atual.getProximo();
        }

        if (atual==null)
            return false;
        if (anterior==null)
            inicio = atual.getProximo();
        else
        anterior.setProximo(atual.getProximo());

        return true;
    }
    
    public int tamanho() {
        int tamanho = 0;
        Noh aux = inicio;

        while (aux != null) {
            tamanho++;
            aux = aux.getProximo();
        }
        return tamanho;
    }

    public Object getPrimeiro() {
        return inicio.getInfo();
    }

    public Object getUltimo() {
        Noh aux = inicio;
        while (aux.getProximo() != null) {
            aux = aux.getProximo();
        }
        return aux.getInfo();
    }

    public void imprime() {
        Noh aux = inicio;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getProximo();
        }
    }


    public void bubbleSort() {

        for(Noh i = inicio; i != null; i = i.getProximo()) {
            for(Noh j = inicio; j != null; j = j.getProximo()) {
                if((int) i.getInfo() < (int) j.getInfo()) {
                    Object aux = i.getInfo();
                    i.setInfo(j.getInfo());
                    j.setInfo(aux);
                }
            }
        }
        

    }
    
    public void imprimeEmOrdem() {
        Noh aux = inicio;

        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getProximo();
        }
    }
    
}