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
}
