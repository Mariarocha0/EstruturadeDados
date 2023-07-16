package Marco2.Atividade16;

public class Noh {
    private int Info;
    private Noh esq;
    private Noh dir;
    private Noh pai;
    private int balanceamento;

    public Noh(int info) {
        Info = info;
    }

    public int getInfo() {
        return Info;
    }

    public void setInfo(int info) {
        Info = info;
    }

    public Noh getPai() {
        return pai;
    }

    public void setPai(Noh pai) {
        this.pai = pai;
    }

    public Noh getDir() {
        return dir;
    }

    public void setDir(Noh dir) {
        this.dir = dir;
    }

    public Noh getEsq() {
        return esq;
    }

    public void setEsq(Noh esq) {
        this.esq = esq;
    }

    public int getBalanceamento() {
        return balanceamento;
    }

    public void setBalanceamento(int balanceamento) {
        this.balanceamento = balanceamento;
    }
}