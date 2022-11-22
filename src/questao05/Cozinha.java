package questao05;

import java.util.ArrayList;

public class Cozinha {
    String tipoCozinha;
    ArrayList<Prato> listaPrato = new ArrayList<Prato>();

    public void adicionarPrato(Prato prato) {
        listaPrato.add(prato);
    }

    public double calculaValor() {
        double somarValor = 0.0;
        for (int i = 0; i < listaPrato.size(); i++) {
            Prato prato = (Prato) listaPrato.get(i);
            somarValor += prato.valor;
        }
        return somarValor;
    }
}
