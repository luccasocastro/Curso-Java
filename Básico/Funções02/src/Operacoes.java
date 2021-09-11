public class Operacoes {

    public static String contador(int i, int f) {
        StringBuilder s = new StringBuilder();
        for(int c=i; c<=f; c++) {
            s.append(c).append(" ");
        }
        return s.toString();
    }
}
