package Marco2.Atividade17;


public class Main {
    public static void main(String[] args) {
        Ordenacao ordena = new Ordenacao();

        int[] array2 = { 5, 3, 17, 10, 8, 9 };
        ordena.quickSort(array2);
        for (int i = 0; i < array2.length; i++)
            System.out.print(array2[i] + " ");
    }

}
