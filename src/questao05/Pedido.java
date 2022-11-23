package questao05;

import java.util.Random;

public class Pedido {
    Random numPedido = new Random();
    double valorPedido;

    
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
    public void calculaPedido(){
        
    }
  

   
}
