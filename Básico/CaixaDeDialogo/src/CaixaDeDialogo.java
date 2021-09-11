import javax.swing.*;

public class CaixaDeDialogo {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Olá!Qual seu nome?");
        JOptionPane.showMessageDialog(null, "Seja bem-vindo, "+nome+"!");

        int resposta = JOptionPane.showConfirmDialog(null, "Você é solteiro?");

        if(resposta != 1){
            JOptionPane.showMessageDialog(null, "Você está ferrado, "+nome+"!");
        }else{
            JOptionPane.showMessageDialog(null, "Ótima resposta...");
        }
    }
}
