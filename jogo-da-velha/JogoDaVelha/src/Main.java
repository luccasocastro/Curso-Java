public class Main {
    public static void main(String[] args) {
        Pessoa luccas = new Pessoa("Luccas", 19, 74.6, 1.78);
        System.out.println(luccas.getIdade());
        System.out.println("Agora eu faço aniversário!");
        luccas.fazerAniversario();
        System.out.println(luccas.getIdade());
    }
}
