import org.json.JSONObject;
import model.Rubrica;
public class Main {

    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica();
        rubrica.aggiungiContatto("Mario", "Rossi", "3535310260");
        rubrica.aggiungiContatto("Luigi", "Verdi", "3835340864");
        rubrica.aggiungiContatto("Aldo", "Bianchi", "3615320860");
        rubrica.aggiungiContatto("Giovanni", "Neri", "3955520669");
        rubrica.aggiungiContatto("Giacomo", "Verdi", "3745330920");

        System.out.println(rubrica);

        rubrica.rimuoviContatto("Mario", "Rossi");
        System.out.println(rubrica);

        System.out.println(rubrica.cerca("Luigi", "Verdi"));

        JSONObject rubricaJson = new JSONObject(rubrica);
        System.out.println(rubricaJson);
    }
}
