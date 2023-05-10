package Marco1.Atividade1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println(" Cálculo Ponto Cartesiano ");
            double x1, x2, y1, y2 = 0.00;
            System.out.print("Insira o valor de x1: ");
            x1 = entrada.nextDouble();
            System.out.print("Insira o valor de y1: ");
            y1 = entrada.nextDouble();

            System.out.print("Insira o valor de x2: ");
            x2 = entrada.nextDouble();
            System.out.print("Insira o valor de y2: ");
            y2 = entrada.nextDouble();

            Cartesiano pc = new Cartesiano(x1,y1,x2,y2);

            System.out.print("\nO resultado dos pontos é: "+ pc.operacaopcartesiano());
        }
	}
}
        

 