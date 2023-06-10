package Marco2.Trabalho;
public class PilhaLista implements IPilha {

    private Noh topo;

    public PilhaLista() {
        this.topo = null;
    }

    public boolean push(Object info) { 
        Noh novo = new Noh(info);
        if (this.estaVazia())
            topo = novo;
        else {
            novo.setProximo(topo);
            topo = novo;
        }
        return true;
    }

    public Object pop() { 
        Object info = null;
        if (!this.estaVazia()) {
            info = topo.getInfo();
            topo = topo.getProximo();
        }
        return info;
    }

    public Object top() {
        if (!this.estaVazia())
            return topo.getInfo();
        return null;
    }

    public boolean estaVazia() {
        return (topo == null);
    }

    public int tamanho() {
        int contador = 0;
        Noh aux = topo;
        while (aux != null) {
            contador++;
            aux = aux.getProximo();
        }
        return contador;
    }

    public PilhaLista inverterOrdem() {
        PilhaLista pilhaCopia = new PilhaLista();
        PilhaLista pilhaTemp = new PilhaLista();
        
        while (!estaVazia()) {
            Object elemento = pop();
            pilhaTemp.push(elemento);
            estadoPilha();
        }
        
        while (!pilhaTemp.estaVazia()) {
            Object elemento = pilhaTemp.pop();
            pilhaCopia.push(elemento);
            push(elemento);        }
        
        return pilhaCopia;
    }

    public void estadoPilha() {
        if (estaVazia()) {
            System.out.println("Pilha vazia!");
            return;
        }
    
        Noh aux = topo;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getProximo();
        }
    }

    

}