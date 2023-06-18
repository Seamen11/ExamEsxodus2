package zadanie15;

import java.util.Scanner;

public class Line extends parabola
{
    static int Yline;

    public void line()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите переменную X: ");
        int x = scanner.nextInt();
        setX(x);
        System.out.println("Введите переменную B: ");
        int b = scanner.nextInt();
        setB(b);
        System.out.println("Уравнение вида f(y) = 2*x + b");
        Yline = 2*x+b;
        System.out.println("f(y) = 2*" + x +" + " + b);
        System.out.println("Точка пересечения: (" + x + "; " + Yline + ") ");

    }
}
