public class Main {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Luccas",19,"M");
        p[1] = new Pessoa("Raquel",19,"F");

        l[0] = new Livro("Java básico","Guanabara",500,50,p[0]);
        l[1] = new Livro("POO","Guanabara",800,740,p[1]);

        System.out.println(l[1].detalhes());
    }

}
