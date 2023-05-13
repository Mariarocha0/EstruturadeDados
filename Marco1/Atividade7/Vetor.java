package Marco1.Atividade7;
 
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

    public int maxRecusao(int array[], int inicio, int fim){
        if(inicio == fim){
            return array[inicio];
        }

        int meio = (inicio + fim) / 2;
        int maior1 = maxRecusao(array, inicio, meio);
        int maior2 = maxRecusao(array, meio + 1, fim);

        if(maior1 > maior2){
            return maior1;
        }else{
            return maior2;
        }
    }


    public int maxInteracao(int numero){
        int maior = 0;
        for(int i = 0; i < numero; i++){
            if(this.array[i] > maior){
                maior = this.array[i];
            }
        }
        return maior;
    }


}
