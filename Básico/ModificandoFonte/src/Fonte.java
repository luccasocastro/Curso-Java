import javax.swing.*;
import java.awt.*;

public class Fonte extends JFrame {

    JButton jb = new JButton("Salve quebrada");
    Font fonte = new Font("Azeret Mono", Font.BOLD, 30);

    public Fonte(){
        jb.setFont(fonte);
        add(jb);
        setTitle("Título");
        setSize(300,380);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Fonte();
    }
}
