package Zadanie23;
import java.util.Scanner;

public class Complex {
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        int realResult = this.real + other.real;
        int imaginaryResult = this.imaginary + other.imaginary;
        return new Complex(realResult, imaginaryResult);
    }

    public Complex subtract(Complex other) {
        int realResult = this.real - other.real;
        int imaginaryResult = this.imaginary - other.imaginary;
        return new Complex(realResult, imaginaryResult);
    }

    public Complex multiply(Complex other) {
        int realResult = (this.real * other.real) - (this.imaginary * other.imaginary);
        int imaginaryResult = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(realResult, imaginaryResult);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
class Complex_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите вещественную часть комплексного числа: ");
        int real = scanner.nextInt();

        System.out.print("Введите мнимую часть комплексного числа: ");
        int imaginary = scanner.nextInt();

        Complex complex1 = new Complex(real, imaginary);

        System.out.print("Введите вещественную часть второго комплексного числа: ");
        real = scanner.nextInt();

        System.out.print("Введите мнимую часть второго комплексного числа: ");
        imaginary = scanner.nextInt();

        Complex complex2 = new Complex(real, imaginary);

        // Сложение комплексных чисел
        Complex sum = complex1.add(complex2);
        System.out.println("Сумма: " + sum);

        // Вычитание комплексных чисел
        Complex difference = complex1.subtract(complex2);
        System.out.println("Разность: " + difference);

        // Умножение комплексных чисел
        Complex product = complex1.multiply(complex2);
        System.out.println("Произведение: " + product);

        scanner.close();
    }
}
