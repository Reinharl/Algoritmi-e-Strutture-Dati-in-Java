package model;

import java.util.ArrayList;

public class Rubrica {
    private ArrayList<Contatto> contatti = new ArrayList<>();

    public Rubrica() {
    }

    public ArrayList<Contatto> getContatti() {
        return contatti;
    }

    public void setContatti(ArrayList<Contatto> contatti) {
        this.contatti = contatti;
    }

    public void aggiungiContatto(String nome, String cognome, String telefono) {
        if (nome != null && cognome != null && telefono != null) {
            Contatto contatto = new Contatto(nome, cognome, telefono);
            contatti.add(contatto);
            System.out.println("Contatto aggiunto!");
        } else {
            System.out.println("Dati insufficienti.");
        }
    }

    public void rimuoviContatto(String nome, String cognome) {
        Contatto contatto = new Contatto(nome, cognome, null);

        for (Contatto element : contatti) {
            if (contatto.equals(element)) {
                contatti.remove(element);
                System.out.println("Contatto rimosso!");
                return;
            }
        }

        System.out.println("Contatto non trovato.");
    }

    public String cerca(String nome, String cognome) {
        Contatto contatto = new Contatto(nome, cognome, null);

        for (Contatto element : contatti) {
            if (contatto.equals(element)) {
                return element.getTelefono();
            }
        }

        System.out.println("Contatto non trovato.");
        return null;
    }

    @Override
    public String toString() {
        String rubrica = "\nRubrica: \n";

        for (Contatto contatto : contatti)
            rubrica = rubrica + contatto.getNome() + " " + contatto.getCognome() + " " + contatto.getTelefono() + "\n";

        return rubrica;
    }
}
