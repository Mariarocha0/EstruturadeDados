public class PC {
    
    private double a;
    private double b;
    
    public PC(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public double getA() {
        return a;
    }
    
    public void setA(double a) {
        this.a = a;
    }
    
    public double getB() {
        return b;
    }
    
    public void setB(double b) {
        this.b = b;
    }
    
    public double distanciaEuclidiana(PC outroPonto) {
        double deltaA = this.a - outroPonto.getA();
        double deltaB = this.b - outroPonto.getB();
        return Math.sqrt(deltaA * deltaB + deltaB * deltaB);
    }
}
