package Prova1.QuestãoP9;

public class Main {
    public static void main(String[] args) {
		LDE lista = new LDE();

		lista.insereFim(1);
		lista.insereFim(2);
		lista.insereFim(5);
		lista.insereFim(4);
		lista.insereFim(3);
		lista.insereFim(0);

		lista.bubbleSort();

		System.out.println("Lista ordenada: ");
		lista.imprimeEmOrdem();

	}

}
    
