public class Cachorro extends Lobo{
    @Override
    public void emitirSom() {
        System.out.println("Au Au Au");
    }

    public void reagir(String frase) {
        if(frase.equals("Toma comida") || frase.equals("Olá")) {
            System.out.println("O cachorro late e abana o rabo");
        }else {
            System.out.println("O cachorro rosna");
        }
    }

    public void reagir(int hora, int min) {
        if(hora < 12) {
            System.out.println("O cachorro abana o rabo");
        }else if(hora >= 18) {
            System.out.println("O cachorro ignora");
        }else {
            System.out.println("O cachorro late e abana o rabo");
        }
    }

    public void reagir(boolean dono) {
        if(dono) {
            System.out.println("O cachorro abana o rabo");
        }else {
            System.out.println("O cachorro late e rosna");
        }
    }

    public void reagir(int idade, float peso) {
        if(idade < 5) {
            if(peso < 10) {
                System.out.println("O cachorro abana o rabo");
            }else {
                System.out.println("O cachorro late");
            }
        }else {
            if(peso < 10) {
                System.out.println("O cachorro rosna");
            }else {
                System.out.println("O cachorro apenas ignora");
            }
        }
    }
}