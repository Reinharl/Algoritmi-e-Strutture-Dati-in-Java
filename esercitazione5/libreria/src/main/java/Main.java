import model.*;

import org.json.JSONObject;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro("La divina commedia", "Dante Alighieri", 20.50);
        Libro l2 = new Libro("Harry Potter", "J.K. Rowilings", 18.90);
        Libro l3 = new Libro("Viaggio al centro della terra", "Giulio Verne", 9.80);
        Libro l4 = new Libro("Ventimila leghe sotto i mari", "Giulio Verne", 12.20);
        Libro l5 = new Libro("Il signore degli anelli", "J.R.R. Tolkien", 29.99);

        ArrayList<Libro> libri = new ArrayList<>();

        libri.add(l1);
        libri.add(l2);
        libri.add(l3);
        libri.add(l4);
        libri.add(l5);

        Libreria libreria = new Libreria(libri);

        System.out.println(libreria.trova("Giulio Verne", 9));

        JSONObject libreriaJson = new JSONObject(libreria);
        System.out.println(libreriaJson);
    }
}
