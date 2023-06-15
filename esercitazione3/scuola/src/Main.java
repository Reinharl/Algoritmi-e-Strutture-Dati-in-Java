import model.*;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("RSSMRO02S04V102B", "Mario", "Rossi");
        System.out.println(p1);

        Studente s1 = new Studente("RSSMRO02S04V102B", "Mario", "Rossi", "572882", "Politecnico di Bari");
        System.out.println(s1);

        Docente d1 = new Docente("RSSMRO02S04V102B", "Mario", "Rossi", "Informatica", 4000);
        System.out.println(d1);
    }
}