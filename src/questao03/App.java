package questao03;

import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class App {

    public static void main(String[] args){
        // componente JFrame
        JFrame miJFrame = new JFrame("Bem vindo");
        miJFrame.setSize(700,500); 

        // componente JPanel
        JPanel miJPanel = new JPanel();
        miJPanel.setSize(200, 200);

        // usamos este diseño para centrar los componentes de JPanel
        miJPanel.setLayout(new GridBagLayout());

        // componente JTextField
        JLabel nome = new JLabel();
        nome.setText("Nome:");

        JLabel email = new JLabel();
        email.setText("Email:");

        // componente JTextArea
        JTextArea miJTextArea = new JTextArea(2,200); 

        JTextArea miJTextArea2 = new JTextArea(2,200); 

        // conecta los componentes JLabel y JTextField en JPanel
        miJPanel.add(nome);
        miJPanel.add(email);

        miJPanel.add(miJTextArea);

        // conectar Jpanel a JFrame
        miJFrame.add(miJPanel);

        // hacer visible JFrame
        miJFrame.setVisible(true);
    }
}