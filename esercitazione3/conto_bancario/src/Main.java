import model.*;

public class Main {
    public static void main(String[] args) {
        Recapito r1 = new Recapito("+39 3906745666","cellulare","m.rossi00@mail.com");
        Indirizzo i1 = new Indirizzo("Via Fani", "20/B", "17021", "Bari", "BA");
        Persona p1 = new Persona("Rossi", "Mario", 22,"RSSMRO02S04V102B", i1,r1);

        ContoBancario c1 = new ContoBancario("01",p1);

        c1.versamento(1000);
        c1.prelievo(500);
        c1.prelievo(400);

        System.out.println("Bilancio = " + c1.getBilancio());
    }
}
