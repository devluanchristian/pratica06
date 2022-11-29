package questao01;

import javax.swing.JOptionPane;

public class App {
    
    public static void main(String[] args) {

        String nome;
        String selecao;

        // A
        nome = JOptionPane.showInputDialog(null, "Escreva o nome de seu jogador de futebol preferido");
        // B
        selecao = JOptionPane.showInputDialog(null, "Escreva o nome da seleção desse jogador");
        // C
        JOptionPane.showMessageDialog(null, "O jogador " + nome + " é da seleção " + selecao);

    }
}