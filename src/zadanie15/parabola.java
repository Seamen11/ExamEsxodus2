package zadanie15;

import java.util.Scanner;

public class parabola extends graphs
{
    static int Yparabola;
    public void parabola()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите переменную A: ");
        int a = scanner.nextInt();
        setA(a);
        System.out.println("Введите переменную B: ");
        int b = scanner.nextInt();
        setB(b);
        System.out.println("Введите переменную C: ");
        int c = scanner.nextInt();
        setC(c);
        System.out.println("Введите переменную X: ");
        int x = scanner.nextInt();
        setX(x);
        System.out.println("Уравнение вида f(y) = ax^2 + b*x + c");
        Yparabola = a*x*x + b*x + c;
        System.out.println("f(y) = " + a + "*" + x + "^2 +" + b + "*" + x + "+" + c + "= " + Yparabola);
        System.out.println("Вершина находится в точке (" + x + ";" + Yparabola + ")");
    }
}
