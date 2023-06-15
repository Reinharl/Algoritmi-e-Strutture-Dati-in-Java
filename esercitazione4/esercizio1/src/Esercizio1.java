import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N;

        System.out.print("Quanti elementi vuoi inserire? ");
        N = input.nextInt();

        double[] array = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Inserisci il " + (i + 1) + "' numero: ");
            array[i] = input.nextDouble();
        }

        double min = Double.MAX_VALUE;

        for (int i = 0; i < N; i++)
            if (array[i] % 2 == 0 && array[i] < min) min = array[i];

        if (min == Double.MAX_VALUE) System.out.println("Non ci sono elementi di valore pari.");
        else System.out.println("Minimo = " + min);

    }
}
