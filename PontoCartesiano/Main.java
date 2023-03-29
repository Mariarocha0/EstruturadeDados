public class Main {
    
    public static void main(String[] args) {
        
        // Criando dois pontos
        PC ponto1 = new PC(2.0, 3.0);
        PC ponto2 = new PC(5.0, 7.0);
        
        // Calculando a distância euclidiana entre os dois pontos
        double distancia = ponto1.distanciaEuclidiana(ponto2);
        
        // Exibindo o resultado
        System.out.println("A distância entre os pontos (" + ponto1.getA() + ", " + ponto1.getB() + ") e (" + ponto2.getA() + ", " + ponto2.getB() + ") é " + distancia);
    }
}