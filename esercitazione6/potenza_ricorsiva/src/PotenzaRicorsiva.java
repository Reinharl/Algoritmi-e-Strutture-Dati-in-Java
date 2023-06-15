import java.util.Scanner;

public class PotenzaRicorsiva {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Base: ");
        double x = input.nextDouble();
        System.out.print("Esponente: ");
        int n = input.nextInt();

        System.out.println("Risultato = " + power(x, n));
    }

    public static double power(double x, int n) {
        if (n == 0)
            return 1;
        else {
            double partial = power(x, n / 2);
            double result = partial * partial;
            if (n % 2 == 1)
                result *= x;
            return result;
        }
    }
}
