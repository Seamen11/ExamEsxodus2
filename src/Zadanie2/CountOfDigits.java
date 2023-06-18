package Zadanie2;

import java.util.Arrays;

public class CountOfDigits
{
    public static int[] countDigits(String source)
    {
        int[] arrayDigits = new int[3];
        int counter = 0;
        for (int i = 0; i < source.length(); i++){
            char a = source.charAt(i);
            try {
                int num = Integer.parseInt(String.valueOf(a));
                arrayDigits[counter] = num;
                counter++;
            }catch (NumberFormatException e){
                System.out.println(a + " Невозожно преобразовать в Int");
            }
        }
        return arrayDigits;
    }

    public static void main(String[] args) {
        String source = "I have 3 cats, 4 dogs, and 1 turtle";
        int[] digits = countDigits(source);
        System.out.println(Arrays.toString(digits));
    }

}
