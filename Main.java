import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int []num = new int[10];

        int i = scan.nextInt();

        if (i < num.length) {
            System.out.println(i + " входит в массив.");
        } else {
            System.out.println(i + " не входит в массив.");
        }
    }
}











