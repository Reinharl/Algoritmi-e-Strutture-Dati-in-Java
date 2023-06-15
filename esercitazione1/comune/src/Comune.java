import java.util.Scanner;

public class Comune {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valoreAbitazione, importoTARI;
        int tipoAbitazione;

        System.out.print("Inserire il valore dell'abitazione: ");
        valoreAbitazione = input.nextDouble();

        System.out.print("\nInserire:\n1) se si tratta dell'abitazione di residenza;\n2) per altre tipologie di abitazioni.\n = ");
        tipoAbitazione = input.nextInt();

        if (tipoAbitazione == 1) {
            importoTARI = valoreAbitazione - 100;
        } else if (tipoAbitazione == 2) {
            importoTARI = valoreAbitazione;
        } else {
            throw new IllegalArgumentException();
        }

        System.out.println("L'importo è di " + importoTARI);
    }
}
