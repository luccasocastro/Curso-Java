package ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        int tot = 0;
        Scanner e = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        num = e.nextInt();

        for(int i=1; i<num+1; i++){
            if(num%i == 0){
                tot += 1;
            }
            System.out.print(i + " ");
        }
        System.out.println("\n");

        if(tot == 2){
            System.out.println(num + " só é divisível por 1 e por ele mesmo!");
            System.out.println("Portanto, é um número primo");
        }else{
            System.out.println(num + " foi divisível por " + tot + " vezes!");
            System.out.println("Portanto, não é um número primo");
        }
    }
}
