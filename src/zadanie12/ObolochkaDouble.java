package zadanie12;

public class ObolochkaDouble
{
    public static double add(double a, double b) {
        return a + b;
    }
    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
    }
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        double a = 5.0;
        double b = 2.0;

        double sum = ObolochkaDouble.add(a, b);
        double quotient = ObolochkaDouble.divide(a, b);
        double result = ObolochkaDouble.power(a, b);

        System.out.println("Сумма: " + sum);
        System.out.println("Частное: " + quotient);
        System.out.println("Результат возведения в степень: " + result);
    }
}
