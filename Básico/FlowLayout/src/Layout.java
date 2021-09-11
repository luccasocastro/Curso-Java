import javax.swing.*;
import java.awt.*;

public class Layout extends JFrame {

    JButton jb = new JButton("Oi");
    JButton jb2 = new JButton("Hi");
    JButton jb3 = new JButton("Hola");

    public Layout(){

        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(jb);
        add(jb2);
        add(jb3);

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
