package Marco2.Atividade16;
public class AVL {

    private Noh raiz;


    public AVL() {
    }

    public Noh getRaiz() {
        return this.raiz;
    }

     public void setRaiz(Noh raiz) {
        this.raiz = raiz;
    }

    public boolean isEmpty() {
        return this.raiz == null;
    }

    public void add(int info, Noh noAtual) {
        if (isEmpty()) {
            Noh novoNo = new Noh(info);
            raiz = novoNo;
             ajustarBalanceamento(raiz);
        } else {
            if (info < noAtual.getInfo()) {
                if (noAtual.getEsq() != null) {
                    // no com valor, vamos leva-lo para recursao.
                    add(info, noAtual.getEsq());
                } else {
                    // no null, vamos inserir.
                    Noh novoNo = new Noh(info);
                    noAtual.setEsq(novoNo);
                    novoNo.setPai(noAtual);
                    ajustarBalanceamento(raiz);
                    raiz = balanceia(raiz);
                }
            } else if (info > noAtual.getInfo()) {
                if (noAtual.getDir() != null) {
                    // no com valor, vamos leva-lo para recursao.
                    add(info, noAtual.getDir());
                } else {
                    // no null, vamos inserir.
                    Noh novoNo = new Noh(info);
                    noAtual.setDir(novoNo);
                    novoNo.setPai(noAtual);
                    ajustarBalanceamento(raiz);
                    raiz = balanceia(raiz);
                }
            } else {
                System.out.println("Caso de no ser repetido!");
            }
        }
    }
 public void ajustarBalanceamento(Noh noAtual) {
        noAtual.setBalanceamento(verificaAltura(noAtual.getEsq()) - verificaAltura(noAtual.getDir()));
        if (noAtual.getDir() != null) {
            ajustarBalanceamento(noAtual.getDir());
        }
        if (noAtual.getEsq() != null) {
            ajustarBalanceamento(noAtual.getEsq());
        }
    }

    public int verificaAltura(Noh noAtual) {
        if (noAtual == null) {
            return -1;
        }
        if (noAtual.getDir() == null && noAtual.getEsq() == null) {
            return 0;
        } else if (noAtual.getEsq() == null) {
            return 1 + verificaAltura(noAtual.getDir());
        } else if (noAtual.getDir() == null) {
            return 1 + verificaAltura(noAtual.getEsq());
        } else {
            if (verificaAltura(noAtual.getEsq()) > verificaAltura(noAtual.getDir())) {
                return 1 + verificaAltura(noAtual.getEsq());
            } else {
                return 1 + verificaAltura(noAtual.getDir());
            }
        }
    }

    public Noh balanceia(Noh noAtual) {
        if (noAtual.getBalanceamento() == 2 && noAtual.getEsq().getBalanceamento() >= 0) {
            noAtual = rotacaoADireita(noAtual);

        } else if (noAtual.getBalanceamento() == -2 && noAtual.getDir().getBalanceamento() <= 0) {
            noAtual = rotacaoAEsquerda(noAtual);

        } else if (noAtual.getBalanceamento() == 2 && noAtual.getEsq().getBalanceamento() < 0) {
            noAtual = rotacaoDuplaDireita(noAtual);

        } else if (noAtual.getBalanceamento() == -2 && noAtual.getDir().getBalanceamento() > 0) {
            noAtual = rotacaoDuplaEsquerda(noAtual);
        }

        if (noAtual.getDir() != null) {
            balanceia(noAtual.getDir());
        }
        if (noAtual.getEsq() != null) {
            balanceia(noAtual.getEsq());
        }
        return noAtual;
    }

    public Noh rotacaoADireita(Noh noAtual) {
        Noh aux = noAtual.getEsq();
        aux.setPai(noAtual.getPai());
        if (aux.getDir() != null) {
            aux.getDir().setPai(noAtual);
        }
        noAtual.setPai(aux);
        noAtual.setEsq(aux.getDir());
        aux.setDir(noAtual);
        if (aux.getPai() != null) {
            if (aux.getPai().getDir() == noAtual) {
                aux.getPai().setDir(aux);
            } else if (aux.getPai().getEsq() == noAtual) {
                aux.getPai().setEsq(aux);
            }
        }
        ajustarBalanceamento(aux);
        return aux;
    }

    public Noh rotacaoAEsquerda(Noh noAtual) {
        Noh aux = noAtual.getDir();
        aux.setPai(noAtual.getPai());
        if (aux.getEsq() != null) {
            aux.getEsq().setPai(noAtual);
        }

        noAtual.setPai(aux);
        noAtual.setDir(aux.getEsq());
        aux.setEsq(noAtual);
        if (aux.getPai() != null) {
            if (aux.getPai().getDir() == noAtual) {
                aux.getPai().setDir(aux);
            } else if (aux.getPai().getEsq() == noAtual) {
                aux.getPai().setEsq(aux);
            }
        }
        ajustarBalanceamento(aux);
        return aux;
    }

    public Noh rotacaoDuplaDireita(Noh noAtual) {
        Noh aux = noAtual.getEsq();
        noAtual.setEsq(rotacaoAEsquerda(aux));
        Noh aux2 = rotacaoADireita(noAtual);
        return aux2;
    }

    public Noh rotacaoDuplaEsquerda(Noh noAtual) {
        Noh aux = noAtual.getDir();
        noAtual.setDir(rotacaoADireita(aux));
        Noh aux2 = rotacaoAEsquerda(noAtual);
        return aux2;
    }

    public boolean isArvoreBalanceada(Noh noAtual) {
        if (noAtual == null) {
            return true;
        }
        if (noAtual.getBalanceamento() > 1 || noAtual.getBalanceamento() < -1) {
            return false;
        }
        return isArvoreBalanceada(noAtual.getEsq()) && isArvoreBalanceada(noAtual.getDir());
    }
}