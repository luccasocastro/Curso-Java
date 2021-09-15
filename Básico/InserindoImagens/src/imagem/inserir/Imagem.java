package imagem.inserir;

import javax.swing.*;
import java.util.Objects;

public class Imagem extends JFrame {

    ImageIcon imagem = new ImageIcon(Objects.requireNonNull(getClass().getResource("imagem.png")));
    JLabel label = new JLabel(imagem);

    public Imagem(){

        add(label);

        setTitle("Título");
        setSize(720,720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(true);
    }

    public static void main(String[] args) {
        new Imagem();
    }
}
