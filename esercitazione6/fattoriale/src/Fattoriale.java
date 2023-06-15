import java.util.Scanner;

public class Fattoriale {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int n = input.nextInt();
        System.out.println("Fattoriale = " + fattoriale(n));
    }

    public static int fattoriale(int n) throws IllegalArgumentException {
        if (n < 0)
            throw new IllegalArgumentException();
        else if (n == 0)
            return 1;
        else
            return n * fattoriale(n - 1);
    }
}
