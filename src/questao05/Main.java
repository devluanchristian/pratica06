package questao05;
public class Main {
    public static void main(String[] args) {
       Cozinha cozinha = new Cozinha("Araba");
       Prato prato = new Prato();

       cozinha.adicionarPrato(prato);

       Pedido pedido = new Pedido(null, 50);
       
       System.out.println(pedido.calculaPedido());



    }
}