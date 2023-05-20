package Marco1.Atividade7;

import java.util.Random;

public class Vetor {
    private int[] numerosAleatorios;
    private int totalNumeros = 0; 


    public Vetor(){
        this.numerosAleatorios = new int[1000];
    }

    public Vetor(int tamanho){
        this.numerosAleatorios = new int[tamanho];
    }
    public int tamanho(){
        return this.totalNumeros;
    }

    public void adicionar(int numero){
        if(this.totalNumeros == this.numerosAleatorios.length){
            return;
        }

        this.numerosAleatorios[this.totalNumeros] = numero;
        this.totalNumeros++;
    }

    public int maxRecursao(int inicio, int fim){
        if(inicio == fim){
            return this.numerosAleatorios[inicio];
        }else{
        int meio = (inicio + fim) / 2;
        int maior1 = maxRecursao( inicio, meio);
        int maior2 = maxRecursao( meio + 1, fim);

        if(maior1 > maior2){
            return maior1;
        }else{
            return maior2;
        }
    }

    }
    public int maxIteracao(){
        int maior = this.numerosAleatorios[0];
        for(int i = 0; i < totalNumeros; i++){
            if(this.numerosAleatorios[i] > maior){
                maior = this.numerosAleatorios[i];
            }
        }
        return maior;
    }

    public void gerandoAleatorio() {
        Random random = new Random();
    
        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = random.nextInt(1000);
        }
    }
}


