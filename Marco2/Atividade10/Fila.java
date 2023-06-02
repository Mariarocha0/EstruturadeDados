package Marco2.Atividade10;

public class Fila implements IFila{
    
        private int numElementosFila;
        private int inicio;
        private Object[] vetorFila;
    
        public Fila(int tam) {
            this.numElementosFila = 0;
            this.inicio = 0;
            this.vetorFila = new Object[tam];
        }
    
        public boolean estaVazia() {
            return (numElementosFila == 0);
        }
    
        public boolean remove() {
            if (this.estaVazia()) {
                System.out.println("Fila estah vazia");
                return false;
            }
            this.inicio = (this.inicio + 1) % this.vetorFila.length;
            this.numElementosFila--;
            return true;
        }
    
        public boolean insereFila(Object info) { 
            if (this.numElementosFila == vetorFila.length) {
                System.out.println("Capacidade da fila esgotou");
                return false;
            }
            int fim = (this.inicio + this.numElementosFila) % this.vetorFila.length;
            this.vetorFila[fim] = info;
            this.numElementosFila++;
            return true;
        }
    
        public int tamanho() {
            return this.numElementosFila;
        }
    
        public int imprime() {
            if (this.estaVazia()) {
                System.out.println("Fila está vazia");
                return 0;
            }
            int indice = this.inicio;
            for (int i = 0; i < this.numElementosFila; i++) {
                System.out.println(this.vetorFila[indice]);
                indice = (indice + 1) % this.vetorFila.length;
            }
            return 1;
        }

}
