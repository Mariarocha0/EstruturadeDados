package Marco1.Atividade8;

import java.util.Random;

public class Vetor {
    Random random = new Random();
    private int[] numerosAleatorios;
    private int totalNumeros = 0; 

    public Vetor(int tamanho){
        this.numerosAleatorios = new int[tamanho];
    }

    public int tamanho(){
        return totalNumeros;
    }

    public void adicionar(int numero){
        this.garanteEspaço();
        this.numerosAleatorios[this.totalNumeros] = numero;
        this.totalNumeros++;
        
    }

    public void adicionaEmOrdem(int numero){
        this.garanteEspaço();

        if(totalNumeros == 0){
            this.numerosAleatorios[0] = numero;
            totalNumeros++;

        }else if(numero > this.numerosAleatorios[totalNumeros-1]){
            this.numerosAleatorios[totalNumeros] = numero;
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
                    this.numerosAleatorios[i] = this.numerosAleatorios[i-1];
                }

            this.numerosAleatorios[indice] = numero;
            totalNumeros++;
            }
        }
    }

    public boolean contem(int numero){
        for(int i = 0; i < totalNumeros; i++){
            if(numero == this.numerosAleatorios[i]){
                return true;
            }
        }
        return false;
    }

    private void garanteEspaço(){
        if(this.totalNumeros == this.numerosAleatorios.length){
            int[] novoVetor = new int[this.numerosAleatorios.length * 2];
            for(int i = 0; i < this.numerosAleatorios.length; i++){
                novoVetor[i] = this.numerosAleatorios[i];
            }
            this.numerosAleatorios = novoVetor;
        }
    }

    public void gerandoAleatorioEmOrdem(){
        for (int i=0; i < totalNumeros; i++){
            this.adicionaEmOrdem(random.nextInt(1000));
        }
    }
    
    
    public void gerandoAleatorio() {
        for (int i = 0; i < this.numerosAleatorios.length; i++) {
            this.numerosAleatorios[i] = random.nextInt(1000);
        }
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

    public int buscaRecursao(Vetor vetor, int inicio, int fim, int numero){
        if(inicio > fim){
            return -1;
        }else{
            int meio = (inicio + fim) / 2;
            if(numero == vetor.numerosAleatorios[meio]){
                return meio;
            }else if(numero < vetor.numerosAleatorios[meio]){
                return buscaRecursao(vetor, inicio, meio - 1, numero);
            }else{
                return buscaRecursao(vetor, meio + 1, fim, numero);
            }
        }
    }   

    public int buscaBinaria(int valor){
        int inicio = 0;
        int fim = this.totalNumeros - 1;
        int meio = 0; 
        while (inicio <= fim){
            meio = (inicio + fim) / 2;
            if (this.numerosAleatorios[meio] == valor){
                return this.numerosAleatorios[meio];
            }else if (this.numerosAleatorios[meio] > valor){
                fim = meio - 1;
            }else{
                inicio = meio + 1;
            }
        }
        return -1;  
    }

    public void ordenaNumeros(){
        int temp = 0;
        for ( int i = 0; i <this.numerosAleatorios.length; i++){
            for(int j=i+1; j < this.numerosAleatorios.length; j++){
                if (this.numerosAleatorios[i] > this.numerosAleatorios[j]){
                    temp = this.numerosAleatorios[i];
                    this.numerosAleatorios[i] = this.numerosAleatorios[j];
                    this.numerosAleatorios[j] = temp;
                }
            }
        }
    }

    public void imprime(){
        for(int i = 0; i < totalNumeros; i++){
            System.out.println(this.numerosAleatorios[i]);
        }
    }

    }
    



