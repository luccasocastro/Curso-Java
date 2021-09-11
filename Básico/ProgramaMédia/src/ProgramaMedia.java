import java.util.Scanner;

public class ProgramaMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o ano em que você nasceu: ");
        int ano = teclado.nextInt();
        int idade = 2021-ano;
        System.out.println("Sua idade é "+idade);
        if(idade >= 18) {
            System.out.println("Você é maior de idade!");
        }else {
            System.out.println("Você é menor de idade!");
        }
    }
}
