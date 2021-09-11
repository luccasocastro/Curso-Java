import javax.swing.*;
import java.awt.*;

public class Layout extends JFrame {

    JButton jb = new JButton("Oi");
    JButton jb2 = new JButton("Hi");
    JButton jb3 = new JButton("Hello");
    JButton jb4 = new JButton("Hola");
    JButton jb5 = new JButton("Bonjour");

    public Layout(){

        setLayout(new BorderLayout());
        add(BorderLayout.NORTH, jb);
        add(BorderLayout.SOUTH, jb2);
        add(BorderLayout.WEST, jb3);
        add(BorderLayout.EAST, jb4);
        add(BorderLayout.CENTER, jb5);

        setTitle("Título");
        setSize(300,380);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Layout();
    }
}
