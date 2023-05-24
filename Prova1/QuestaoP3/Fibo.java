package Prova1.QuestaoP3;

public class Fibo {

    public int fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
   
}
