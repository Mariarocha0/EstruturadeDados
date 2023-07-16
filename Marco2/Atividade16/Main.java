package Marco2.Atividade16;

public class Main {
    public static void main (String[]args){



        AVL AVLarvore = new AVL();

        AVLarvore.add(51, AVLarvore.getRaiz());
        AVLarvore.add(57, AVLarvore.getRaiz());
        AVLarvore.add(98, AVLarvore.getRaiz());
        AVLarvore.add(19, AVLarvore.getRaiz());
        AVLarvore.add(11, AVLarvore.getRaiz());
        AVLarvore.add(45, AVLarvore.getRaiz());
        AVLarvore.add(79, AVLarvore.getRaiz());


        System.out.println("Balanceamento da árvore: ");
        AVLarvore.isArvoreBalanceada(AVLarvore.getRaiz());
        
        if (AVLarvore.isArvoreBalanceada(AVLarvore.getRaiz())) {
            System.out.println("A árvore está balanceada!");
        } else {
            System.out.println("A árvore não está balanceada!");
        }

    }

}
    
