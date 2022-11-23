package questao05;

import java.util.ArrayList;

public class Cozinha {
    String tipoCozinha;
    ArrayList<Prato> listaPrato = new ArrayList<Prato>();

    public Cozinha(String tipoCozinha) {
        this.tipoCozinha = tipoCozinha;
    }

    public String getTipoCozinha() {
        return tipoCozinha;
    }

    public void setTipoCozinha(String tipoCozinha) {
        this.tipoCozinha = tipoCozinha;
    }

    public void adicionarPrato(Prato prato) {
        listaPrato.add(prato);
    }

    public int quantidadePrato() {
        return listaPrato.size();
    }

}
