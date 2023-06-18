package zadanie13;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix666 {
    public static int sumArray(int[][] array, int x, int y) {
        int sum = 0;
        for (int i = 0; i < x; i++) {
            sum += array[i][0];
            sum += array[i][y - 1];
        }
        for (int j = 1; j < y - 1; j++) {
            sum += array[0][j];
            sum += array[x - 1][j];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность матрицы: ");
        System.out.print("по границе X: ");
        int x = scanner.nextInt();
        System.out.print("по границе Y: ");
        int y = scanner.nextInt();

        int[][] array = new int[x][y];
        while (sumArray(array, x, y) != 666) {
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    array[i][j] = 1 + (int) (Math.random() * 100);
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}