import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int op;
        String ch;
        double num1, num2, res;

        Scanner t = new Scanner(System.in);

        do {
            System.out.println("Informe o primeiro número: ");
            num1 = t.nextDouble();
            System.out.println("Informe o segundo número: ");
            num2 = t.nextDouble();

            System.out.println("Informe uma opção:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            op = t.nextInt();

            Calculadora resultado = new Calculadora(num1,num2,op);

            System.out.println("Deseja continuar? (S ou N):");
            ch = t.next().toUpperCase();

        }while(ch.equals("S"));
    }

}
