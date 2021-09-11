public class Vetores {
    // Vetores são objetos em java
    public static void main(String[] args) {
        int[] n = {2, 3, 5, 7, 8};
        System.out.println("Total de casas do meu vetor é " + n.length);
        for(int i=0; i<n.length; i++) {
            System.out.println("Na posição "+ i +" temos "+ n[i]);
        }
    }

}
