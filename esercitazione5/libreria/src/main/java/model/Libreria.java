package model;

import java.util.ArrayList;

public class Libreria {
    private ArrayList<Libro> libri;

    public Libreria(ArrayList<Libro> libri) {
        this.libri = libri;
    }

    public ArrayList<Libro> getLibri() {
        return libri;
    }

    public void setLibri(ArrayList<Libro> libri) {
        this.libri = libri;
    }

    @Override
    public String toString() {
        return "Libreria{" +
                "libri=" + libri +
                '}';
    }

    public int trova(String a, double k) {
        int conta = 0;
        for (Libro libro : libri)
            if (libro.getAutore().equals(a) && libro.getPrezzo() > k)
                conta++;
        return conta;
    }
}
