package zadanie11;
import java.util.Scanner;

public class factorial
{
    public static int fact(int chislo)
    {
        if (chislo == 1){
            return 1;
        }else{
            return chislo * fact(chislo - 1);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Факториал какого числа хотите найти: ");
        Scanner scanner = new Scanner(System.in);
        int chis = scanner.nextInt();
        int a = fact(chis);
        System.out.println("факториал от " + chis + " равен: " + a);
    }
}
