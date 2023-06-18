package zadanie14;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Treugolnik
{
   public static double ploshad(int a, int b, int c)
   {
       double poluperimetr = (double) (a + b + c) / 2;
       return pow((poluperimetr*(poluperimetr - a)*(poluperimetr - b)*(poluperimetr-c)), 0.5);
   }
   public static int perimetr(int a, int b, int c)
   {
       return a + b + c;
   }

    public static void main(String[] args) {
        System.out.println("Введите стороны вашего треугольника: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону a: ");
        int a  = scanner.nextInt();
        System.out.println("Введите сторону b: ");
        int b = scanner.nextInt();
        System.out.println("Введите сторону c: ");
        int c = scanner.nextInt();

        System.out.println("Площадь тругольника (по формуле Геррона): " + ploshad(a, b, c));
        System.out.println("Периметр треугольника: " + perimetr(a, b, c));
    }
}
