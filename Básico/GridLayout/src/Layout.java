import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout extends JFrame {

    JButton jb = new JButton("Oi");
    JButton jb2 = new JButton("Hola");
    JButton jb3 = new JButton("Hello");
    JButton jb4 = new JButton("Bonjour");

    public Layout(){

        setLayout(new GridLayout(2,2));
        add(jb);
        add(jb2);
        add(jb3);
        add(jb4);

        setTitle("Título");
        setSize(300, 380);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Layout();
    }
}
