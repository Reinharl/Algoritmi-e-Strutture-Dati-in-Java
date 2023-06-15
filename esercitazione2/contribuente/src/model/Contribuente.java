package model;

public class Contribuente {
    private String nome;
    private String cognome;
    private int annoNascita;
    private double reddito;
    private boolean italiano;

    public Contribuente(String name, String surname, int birthYear, double income, boolean isItalian) {
        this.nome = name;
        this.cognome = surname;
        this.annoNascita = birthYear;
        this.reddito = income;
        this.italiano = isItalian;
    }

    public Contribuente() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getAnnoNascita() {
        return annoNascita;
    }

    public void setAnnoNascita(int annoNascita) {
        this.annoNascita = annoNascita;
    }

    public double getReddito() {
        return reddito;
    }

    public void setReddito(double reddito) {
        this.reddito = reddito;
    }

    public boolean isItaliano() {
        return italiano;
    }

    public void setItaliano(boolean italiano) {
        this.italiano = italiano;
    }
}
