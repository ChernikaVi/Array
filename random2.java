import java.util.Scanner;
import static java.lang.Math.random;

public class random2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        double[] test = new double[p];


        for (int i = 0; i < test.length; i++) {
            test[i] = random ();
            System.out.println(test[i]);
        }

        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;

        int k, m;
        m = 0;
        k = 0;

        for (int i = 0; i<test.length; i++) {
            if (max < test[i]) {
                max = test[i];
                m = i;
            }

            if (min > test[i]) {
                min = test[i];
                k = i;
            }
        }
        System.out.println();
        System.out.println("Максимальное значение" + max + "   position " + m);
        System.out.println("Минимальное значение" + min + "   position " + k);


        double a;
        double sum = 0;

        for (double v : test) {
            sum = sum + v;
        }

        a = sum / test.length;
        System.out.println();
        System.out.println("Среднее арифметическое" + a);
    }
}
