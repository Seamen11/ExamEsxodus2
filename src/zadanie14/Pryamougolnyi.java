package zadanie14;

import java.util.Scanner;

public class Pryamougolnyi extends Treugolnik
{
    public static boolean pryamougolnyi(int a, int b, int c)
    {
        return b * b + a * a == c * c;
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
        System.out.println("Треугольник является прямоугольным: " + pryamougolnyi(a,b,c));
    }
}
