import model.TipoCapoAbbigliamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserisci la marca del capo d'abbigliamento: ");
        String marca = sc.nextLine();
        System.out.print("Inserisci il modello del capo d'abbigliamento: ");
        String modello = sc.nextLine();
        System.out.print("Inserisci il costo del capo d'abbigliamento: ");
        double costo = sc.nextDouble();
        sc.nextLine();

        TipoCapoAbbigliamento tipoCapoAbbigliamento = new TipoCapoAbbigliamento(marca, modello, costo);

        System.out.print("Inserisci lo sconto: ");
        double sconto = sc.nextDouble();

        tipoCapoAbbigliamento.modificaCosto(tipoCapoAbbigliamento.applicaSconto(sconto));
        tipoCapoAbbigliamento.getCosto();
    }
}
