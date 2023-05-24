package Prova1.QuestaoP3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Fibo fibonacci = new Fibo();

        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("══════════Série Fibonacci══════════");
        System.out.println("Qual a posição você deseja saber? ");
        n = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("╔══════════════════════════════════╗");
            System.out.println("║O " + (i + 1) + "º termo da série Fibonacci é: " + fibonacci.fibonacci(n) + "║");
            System.out.println("╚══════════════════════════════════╝");

        }
    }
}

