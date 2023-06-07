package Marco2.Trabalho;
public class PilhaVetor implements IPilha {

    private Object[] pilha;
    private int numeroElementos;

    public PilhaVetor(int tamanhoVetor) {
        this.pilha = new Object[tamanhoVetor];
        this.numeroElementos = 0;
    }

    public boolean push(Object info) {
        if (this.numeroElementos == pilha.length) {
            System.out.println("Pilha cheia!");
            return false;
        }
        this.pilha[this.numeroElementos] = info;
        this.numeroElementos++;
        return true;
    }

    public Object pop(){ 
        Object o = null;
        if(this.estaVazia()){
            System.out.println("Pilha vazia!");
            return null;
        }
        o = this.pilha[numeroElementos - 1];
        this.pilha[numeroElementos - 1] = null;
        this.numeroElementos--;
        return o;
    }

    public boolean estaVazia(){
        return (this.numeroElementos == 0);
    }

    public int tamanho(){
        return this.numeroElementos;
    }   

    public Object top(){
        if(this.estaVazia()){
            System.out.println("Pilha vazia!");
            return null;
        }
        return this.pilha[numeroElementos - 1];
    }


    public boolean palindromo(String palavra) {
        int tamanho = palavra.length();

        for (int i = 0; i < palavra.length(); i++){
            this.push(palavra.charAt(i));
        }

        for (int i = 0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    
    public void estadoPilha() {
    if (estaVazia()) {
        System.out.println("Pilha vazia!");
        return;
    }

    System.out.println("Estado da pilha:");
    for (int i = numeroElementos - 1; i >= 0; i--) {
        System.out.println(pilha[i].toString());
    }
}  


}