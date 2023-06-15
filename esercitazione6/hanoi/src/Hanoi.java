import java.util.Scanner;

public class Hanoi {
    public static void main(String args[]) {
        char inizio = '1';  // Asta A
        char fine = '2';    // Asta B
        char temp = '3';    // Asta C

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il numero di dischi: ");
        hanoi(input.nextInt(), inizio, temp, fine);
    }

    public static void hanoi(int n, char inizio, char temp, char fine) {
        if (n == 1)
            System.out.println(inizio + " -->> " + fine); //Passo base
        else {
            hanoi(n - 1, inizio, fine, temp); // Sposto n-1 dischi sul asta C
            System.out.println(inizio + " -->> " + fine); // Sposto l'n-essimo disco sul asta B
            hanoi(n - 1, temp, inizio, fine); // Sposto gli n-1 dischi dal asta C sul asta B
        }
    }
}
