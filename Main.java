import java.util.Scanner;

public class task0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] num = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int i = scan.nextInt();

        if (i < num.length) {
            System.out.println(i + " входит в массив.");
        } else {
            System.out.println(i + " не входит в массив.");
        }
    }
}










