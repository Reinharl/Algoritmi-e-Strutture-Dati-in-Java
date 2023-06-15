import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vettore = {18, 9, 20, 211, 22, 0, -12, -83, 29, 5};
        int valore;

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci numero: ");
        valore = input.nextInt();

        for (int elemento : vettore)
            if (valore == elemento) {
                System.out.println("Presente!");
                return;
            }

        System.out.println("Assente!");


    }
}
