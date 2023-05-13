package Marco1.Atividade7;

import java.util.Random;

public class Vetor {
    private int[] array = new int[0];
    private int totalNumeros = 0; 
    private int inicio = 0;
    private int fim = 0; 
    private int meio = 0; 


    public Vetor(){
        this.array = new int[1000];
    }

    public int tamanho(){
        return this.totalNumeros;
    }

    public void adicionar(int numero){
        if(this.totalNumeros == this.array.length){
            return;
        }

        this.array[this.totalNumeros] = numero;
        this.totalNumeros++;
    }

    public int maxRecursao(int array[], int inicio, int fim){
        if(inicio == fim){
            return array[inicio];
        }

        int meio = (inicio + fim) / 2;
        int maior1 = maxRecursao(array, inicio, meio);
        int maior2 = maxRecursao(array, meio + 1, fim);

        if(maior1 > maior2){
            return maior1;
        }else{
            return maior2;
        }
    }


    public int maxIteracao(int numero){
        int maior = 0;
        for(int i = 0; i < numero; i++){
            if(this.array[i] > maior){
                maior = this.array[i];
            }
        }
        return maior;
    }

    public int[] gerandoAleatorio() {
        int[] vetor = new int[1000];
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            vetor[i] = random.nextInt(9999);
        }

        return vetor;
    }
}


