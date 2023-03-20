import java.util.Scanner;

public class remove {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] mas = new int[][]{{1, 2, 3,}, {4, 5, 6,}, {7, 8, 9}};

        int i,j;

        System.out.println("Исходный массив:");

        for (i=0; i<mas.length; i++) {
            for (j=0; j<mas[i].length; j++) {
                System.out.print(mas[i][j]+" ");
            }
            System.out.println();
        }


        System.out.print("Удалить из массива элемент Nº: ");

        int del = in.nextInt();
        int idx = 1;

        for (int i1 = 0; i1 < mas.length; i1++) {
            for (int j1 = 0; j1 < mas.length; j1++) {
                if (idx == del) {
                    mas[i1][j1] = 0;
                }
                System.out.print(mas[i1][j1] + " ");
                idx++;
            }
            System.out.println();
        }
    }
}