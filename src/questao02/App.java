package questao02;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        Double publico;
        Float ingresso;
        //A
        publico = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Quantidade de público do primeiro jogo da abertura da copa do mundo"));
        //B
        ingresso = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor do ingresso: "));
        //C
        JOptionPane.showMessageDialog(null, "O valor de arrecadação do primeiro jogo é " + publico * ingresso);

    }

}
