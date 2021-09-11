import java.util.Arrays;

public class EstruturaForEach {
    public static void main(String[] args) {
        double[] x = {3.5 , 2.75, 9, -4.5};
        Arrays.sort(x);
        for(double valor : x) {
            System.out.print(valor + " ");
        }
    }
}