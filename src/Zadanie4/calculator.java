package Zadanie4;

import java.util.HashMap;
import java.util.Map;

public class calculator
{
    public static String calculator(String deistvie)
    {
        Map<String, Integer> digits = new HashMap<>();
        digits.put("ноль", 0);
        digits.put("один", 1);
        digits.put("два", 2);
        digits.put("три", 3);
        digits.put("четыре", 4);
        digits.put("пять", 5);
        digits.put("шесть", 6);
        digits.put("семь", 7);
        digits.put("восемь", 8);
        digits.put("девять", 9);

        Map<Integer, String> results = new HashMap<>();
        results.put(0, "ноль");
        results.put(1, "один");
        results.put(2, "два");
        results.put(3, "три");
        results.put(4, "четыре");
        results.put(5, "пять");
        results.put(6, "шесть");
        results.put(7, "семь");
        results.put(8, "восемь");
        results.put(9, "девять");
        results.put(10, "десять");
        results.put(11, "одиннадцать");
        results.put(12, "двенадцать");
        results.put(13, "триадцать");
        results.put(14, "четырнадцать");
        results.put(15, "пятнадцать");
        results.put(16, "шестнадцать");
        results.put(17, "семнадцать");
        results.put(18, "восемнадцать");
        results.put(19, "девяднацать");
        results.put(20, "двадцать");
        results.put(30, "тридцать");
        results.put(40, "сорок");
        results.put(50, "пятьдесят");
        results.put(60, "шестисят");
        results.put(70, "семдесят");
        results.put(80, "восемдесят");
        results.put(90, "девяносто");
        results.put(100, "сто");


        String[] parts = deistvie.split(" ");

        int a = digits.get(parts[0]);
        int c = digits.get(parts[2]);
        String operator = parts[1].toLowerCase();

        if (operator.equalsIgnoreCase("плюс"))
        {
            int res = a + c;
            return results.get(res);
        }if(operator.equalsIgnoreCase("минус")){
            int res =  a - c;
            if (res < 0){
                return "минус " + results.get(res);
            }else{
                return results.get(res);
            }
        }else{
            int res = a * c;
            if (res > 20)
            {
                int part1 = res - res % 10;
                int part2 = res % 10;
                System.out.println(part1);
                return results.get(part1) + " " + results.get(part2);
            }else{
                return results.get(res);
            }
        }
    }

    public static void main(String[] args) {
        String res = calculator("восемь уможить четыре");
        System.out.println("Результат: " + res);
    }
}
