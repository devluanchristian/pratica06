package questao05;

import java.util.Random;



public class Pedido {
    Random numPedido = new Random();
    double valorPedido;
    Cozinha cozinha = new Cozinha(null);

    public Pedido(Random numPedido, double valorPedido) {
        this.numPedido = numPedido;
        this.valorPedido = valorPedido;
    }

    public Random getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(Random numPedido) {
        this.numPedido = numPedido;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public double calculaPedido() {
        double somar = 0.0;
        for (int i = 0; i < cozinha.listaPrato.size(); i++) {

            Prato prato = (Prato) cozinha.listaPrato.get(i);
            somar += somar + prato.valor;
        }

        return somar;
    }

}
