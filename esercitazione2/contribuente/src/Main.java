import model.Contribuente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserisci il nome: ");
        String nome = sc.nextLine();
        System.out.print("Inserisci il cognome: ");
        String cognome = sc.nextLine();
        System.out.print("Inserisci l'anno di nascita: ");
        int annoNascita = sc.nextInt();
        System.out.print("Inserisci il reddito: ");
        double reddito = sc.nextDouble();
        sc.nextLine();
        System.out.print("È italiano (true/false): ");
        boolean italiano = sc.nextBoolean();

        Contribuente contribuente = new Contribuente();
        contribuente.setNome(nome);
        contribuente.setCognome(cognome);
        contribuente.setAnnoNascita(annoNascita);
        contribuente.setReddito(reddito);
        contribuente.setItaliano(italiano);

        System.out.println("\nNome: " + contribuente.getNome());
        System.out.println("Cognome: " + contribuente.getCognome());
        System.out.println("Anno di Nascita: " + contribuente.getAnnoNascita());
        System.out.println("Reddito: " + contribuente.getReddito());
        System.out.println("È italiano: " + contribuente.isItaliano());
    }
}

