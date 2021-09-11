public class Main {
    public static void main(String[] args) {
        // Título do vídeo
        Video[] v = new Video[3];
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 12 de HTML5");
        v[2] = new Video("Java IntermediÃ¡rio");

        //Nome, idade, sexo, login
        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Luccas", 19, "M", "Luxka");
        g[1] = new Gafanhoto("Raquel", 19, "F", "Hakell");

        Visualizacao[] vis = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]); // Assiste Java Intermediário
        vis[0].avaliar(35);
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[1]);
        System.out.println(vis[1].toString());
    }
}