package Zadanie3;

import java.util.Arrays;

public class Separator
{
    public static String[] separator(int n)
    {
        String aa = String.valueOf(n);
        String[] aaS = new String[aa.length()];
        for (int i = 0; i < aa.length(); i++)
        {
            char a = aa.charAt(i);
            aaS[i] = String.valueOf(a);
            System.out.println(a);
        }
        return aaS;
    }

    public static void main(String[] args) {
        int n = 23599;
        String[] s = separator(n);
        System.out.println(Arrays.toString(s));
    }

}
