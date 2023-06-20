package Marco2.Atividade14;
public class Noh {
    private int valor;
    private Noh esquerda;
    private Noh direita;
    private Noh pai;

    Noh(int v) {this.valor = v; }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {this.valor = valor;}

    public Noh getEsquerda() {return esquerda;}

    public void setEsquerda(Noh esquerda) {this.esquerda = esquerda;}

    public Noh getDireita() {return direita;}

    public void setDir(Noh direita) {this.direita = direita;}

    public Noh getPai() {return pai;}

    public void setPai(Noh pai) {this.pai = pai;}
}