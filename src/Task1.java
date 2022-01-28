import java.util.Scanner;
public class Task1 {
    public static void main(String[] args)
    {
        System.out.print("Введите сторону квадрата:");
        Scanner concole = new Scanner(System.in);
        int a = concole.nextInt();
        int S = 0;
        int P = 0;
        int d = 0;
        int d2 = 0;
        {
            S = a*a;
            P = a*4;
            d2 = (a*a)*(a*a);
        }
        System.out.print("Диагональ квадрата = ");
        System.out.print(Math.sqrt(d2));
        System.out.println("см");
        System.out.print("Периметр квадрата = ");
        System.out.print(P);
        System.out.println("см");
        System.out.print("Площадь квадрата = ");
        System.out.print(S);
        System.out.println("см в квадрате");
    }
}
