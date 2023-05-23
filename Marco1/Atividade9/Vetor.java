package Marco1.Atividade9;

import java.util.Random;

public class Vetor{

    Random random = new Random();
    private int totalNumeros = 0;
    private int[] numerosAleatorios;

    public Vetor(int tamanho){
        this.numerosAleatorios = new int[tamanho];
    }

    public void adiciona(int numeros){
        this.garanteEspaco();
        this.numerosAleatorios[totalNumeros] = numeros;
        totalNumeros++;
    }

    public void adicionaEmOrdem(int numero){
        this.garanteEspaco();

        if(totalNumeros == 0){
            numerosAleatorios[0] = numero;
            totalNumeros++;

        }else if(numero > numerosAleatorios[totalNumeros-1]){
            numerosAleatorios[totalNumeros] = numero;
            totalNumeros++;

        }else{

            int indice = -1;

            for(int i=0; i < totalNumeros; i++){
                if (numero < this.numerosAleatorios[i]){
                    indice = i; 
                    break; 
                }
            }

            if (indice != -1){ 
                for(int i=(totalNumeros); i>indice; i--){
                    numerosAleatorios[i] = numerosAleatorios[i-1];
                }

            numerosAleatorios[indice] = numero;
            totalNumeros++;
            }
        }
    }

    public int tamanho(){
        return totalNumeros;
    }

    public boolean contem(int numeros){
        for(int i=0; i<this.totalNumeros; i++){
            if(numeros == this.numerosAleatorios[i]){
                return true;
            }
        }
        return false;
    }

    public boolean cheio(){
        if (totalNumeros == this.numerosAleatorios.length)
        return true;
        return false;
    }


    private void garanteEspaco(){
        if (this.cheio()){
        int[] novos = new int[this.numerosAleatorios.length * 2];
        for (int i=0; i < this.numerosAleatorios.length; i++)
        novos[i] = this.numerosAleatorios[i];
        this.numerosAleatorios = novos;
        }

    }

    public void gerandoAleatorio(){
        for (int i = 0; i < numerosAleatorios.length; i++) {
            adiciona(random.nextInt(1000));
        }
    }


    public int maxRecursao(Vetor vetor, int inicio, int fim){
        int meio=0, max1 = 0, max2 = 0;
        if(inicio == fim){
            return numerosAleatorios[inicio];
        }else{
            meio = (inicio+fim)/2;
            max1 = maxRecursao(vetor, inicio, meio);
            max2 = maxRecursao(vetor, meio+1, fim);
            if (max1 > max2){
            return max1;
            }else{
                return max2;
            }
        }

    }

    public int buscaRecursao(Vetor vetor, int inicio, int fim, int numero){
        int meio=0;

        if (inicio > fim) {
            return -1;
        }
        meio= (inicio + fim) / 2;
        if (numerosAleatorios[meio] == numero) {
            return numerosAleatorios[meio];
        } else if (numerosAleatorios[meio] > numero) {
            return buscaRecursao(vetor, inicio, meio-1, numero); 
        } else {
            return buscaRecursao(vetor, meio+1, fim, numero);
        }
    }

    public int buscaBinaria(int valor){
        int inicio = 0;
        int fim = this.totalNumeros - 1;
        int meio = 0; 
        while (inicio <= fim){
            meio = (inicio + fim) / 2;
            if (this.numerosAleatorios[meio] == valor){
                return numerosAleatorios[meio];
            }else if (this.numerosAleatorios[meio] > valor){
                fim = meio - 1;
            }else{
                inicio = meio + 1;
            }
        }
        return -1;  
    }

    public void imprime(){
        for(int i=0; i < totalNumeros; i++){
            System.out.println(numerosAleatorios[i]);
        }
    }

    public void bubble_sort(){
        for (int i = 0; i < this.totalNumeros; i++){
            for (int j = 0; j < this.totalNumeros-1; j++){
                if (this.numerosAleatorios[j] > this.numerosAleatorios[j+1]) {
                    int aux = this.numerosAleatorios[j];
                    this.numerosAleatorios[j] = this.numerosAleatorios[j+1];
                    this.numerosAleatorios[j+1] = aux;
                }
            }
        }
    }

    public void selection_sort(){
        for (int i = 0; i < this.totalNumeros; i++) {
            int menor = i;
            for (int j = i+1; j < this.totalNumeros; j++){
                if (this.numerosAleatorios[j] < this.numerosAleatorios[menor]){
                    menor = j;
                    int aux = numerosAleatorios[i];
                    this.numerosAleatorios[i] = this.numerosAleatorios[menor];
                    this.numerosAleatorios[menor] = aux;
                }
            }
        }
    }

    public void insertion_sort() {
        for (int i = 1; i < this.totalNumeros; i++) {
            int chave = this.numerosAleatorios[i];
            int j = i - 1;
            while (j >= 0 && chave < this.numerosAleatorios[j]) {
                this.numerosAleatorios[j + 1] = this.numerosAleatorios[j];
                j--;
            }
            this.numerosAleatorios[j + 1] = chave;
        }
    }
        

	
}