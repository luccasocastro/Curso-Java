import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaSwing extends JFrame{
    private JTextField lblNome1;
    private JTextField lblNome2;
    private JButton btnAc;
    private JButton btnSair;
    private JLabel lblRes;
    private JPanel myPanel;

    public JanelaSwing(){
        setContentPane(myPanel);
        setTitle("Janela");
        setSize(400,380);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        btnAc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String nome1 = lblNome1.getText();
                String nome2 = lblNome2.getText();
                lblRes.setText("Olá, " + nome1 + " " + nome2 + ", tudo bem?");
            }
        });

        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new JanelaSwing();
    }
}
