import java.util.Scanner;

public class PerDuePerDieci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N;

        System.out.print("Quanti numeri vuoi inserire? ");
        N = input.nextInt();

        int[] array = new int[N];
        int[] arrayPerDue = new int[N];
        int[] arrayPerDieci = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Inserisci il " + (i + 1) + "' numero: ");
            array[i] = input.nextInt();
            arrayPerDue[i] = array[i] * 2;
            arrayPerDieci[i] = array[i] * 10;
        }

        System.out.println("\nGli elementi raddoppiati sono: ");
        for (int element : arrayPerDue) {
            System.out.print(element + " ");
        }

        System.out.println("\nGli elementi decuplicati sono: ");
        for (int element : arrayPerDieci) {
            System.out.print(element + " ");
        }
    }
}
