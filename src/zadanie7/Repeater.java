package zadanie7;

import java.util.Scanner;

public class Repeater
{
    public static void main(String[] args) {
        System.out.println("Введите слово: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        for (int i = 0; i < 6; i++)
        {
            System.out.println(word);
        }
    }
}
