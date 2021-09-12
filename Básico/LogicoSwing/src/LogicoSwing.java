import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogicoSwing extends JFrame{
    private JTextField lblNum1;
    private JTextField lblNum2;
    private JButton btnCalc;
    private JLabel lblDiv;
    private JLabel lblRaiz;
    private JPanel mainPanel;

    public LogicoSwing(){
        setContentPane(mainPanel);
        setTitle("Calculadora");
        setSize(450,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int num1 = Integer.parseInt(lblNum1.getText());
                int num2 = Integer.parseInt(lblNum2.getText());
                int resDiv = num1/num2;
                int resRaiz = (int) Math.sqrt(num1);
                lblDiv.setText(Integer.toString(resDiv));
                lblRaiz.setText(Integer.toString(resRaiz));
            }
        });
    }

    public static void main(String[] args) {
        new LogicoSwing();
    }
}
