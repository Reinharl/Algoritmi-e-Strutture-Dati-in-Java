import model.Motorino;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserisci il colore del motorino: ");
        String colore = sc.nextLine();
        System.out.print("Inserisci la velocità del motorino: ");
        double velocita = sc.nextDouble();
        sc.nextLine();
        System.out.print("Inserisci il tipo di motorino: ");
        String tipo = sc.nextLine();
        System.out.print("Il motorino ha l'antifurto? Si(true) No(false): ");
        boolean antifurto = sc.nextBoolean();

        Motorino motorino = new Motorino(colore, velocita, tipo, antifurto);
        System.out.println(motorino);

        motorino.accelera(100);
        System.out.println(motorino);

        motorino.inserisciAntifurto();
        motorino.accelera(100);
        System.out.println(motorino);
    }
}
