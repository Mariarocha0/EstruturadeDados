package Marco1.Atividade8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Vetor vetor = new Vetor(10);
        vetor.gerandoAleatorio();
        vetor.ordenaNumeros();
        vetor.imprime();
        System.out.println("Máximo: " + vetor.maxRecursao(0,0));

        System.out.println("Digite um número para buscar: ");
        int numero = entrada.nextInt();
        entrada.nextLine();


        long Inicio = System.nanoTime();
        if(vetor.buscaBinaria(numero) == numero){
            System.out.println("Número encontrado!"+ vetor.buscaBinaria(numero));
        }else{
            System.out.println("Este número não foi encontrado!");
        }
        long Fim = System.nanoTime();
        System.out.println("Tempo de execução: " + (Fim - Inicio) + "nanosegundos");

        long Inicio2 = System.nanoTime();
        if (vetor.buscaRecursao(vetor, 0, vetor.tamanho() - 1, numero) == numero) {
            System.out.println("Número encontrado!"+ vetor.buscaRecursao(vetor, 0, vetor.tamanho() - 1, numero));
        } else {
            System.out.println("Este número não foi encontrado!");
        }
        long Fim2 = System.nanoTime();
        System.out.println("Tempo de execução: " + (Fim2 - Inicio2) + "nanosegundos");
        
    }
    
}