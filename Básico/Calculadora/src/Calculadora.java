public class Calculadora {

    public Calculadora(double n1, double n2, int op) {
        switch(op) {
            case 1:
                System.out.println("A soma de "+n1+" mais "+n2+" é: "+(n1+n2));
                break;
            case 2:
                System.out.println(n1+" menos "+n2+" é: "+(n1-n2));
                break;
            case 3:
                System.out.println(n1+" multiplicado por "+n2+" é: "+(n1*n2));
                break;
            case 4:
                System.out.println(n1+" divido por "+n2+" é: "+(n1/n2));
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
