import javax.swing.*;
import java.awt.*;

public class Cores extends JFrame {

    JButton jb = new JButton("OI");
    Font fonte = new Font("Roboto Mono", Font.BOLD, 30);
    Color cor = new Color(219,91,246);

    public Cores(){

        jb.setForeground(cor);
        jb.setBackground(Color.DARK_GRAY);

        jb.setFont(fonte);
        add(jb);
        setTitle("Título");
        setSize(300, 380);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Cores();
    }
}
