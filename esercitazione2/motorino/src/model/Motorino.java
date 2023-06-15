package model;

public class Motorino {
    private String colore;
    private double velocita;
    private String tipo;
    private boolean antifurto;

    public Motorino(String color, double speed, String type, boolean theftProtection) {
        this.colore = color;
        this.velocita = speed;
        this.tipo = type;
        this.antifurto = theftProtection;
    }

    public Motorino() {
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public double getVelocita() {
        return velocita;
    }

    public void setVelocita(double speed) {
        this.velocita = speed;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isAntifurto() {
        return antifurto;
    }

    public void setAntifurto(boolean antifurto) {
        this.antifurto = antifurto;
    }

    public void accelera(double speed) {
        if (!antifurto) {
            this.velocita += speed;
        }
    }

    public void inserisciAntifurto() {
        antifurto = true;
    }

    @Override
    public String toString() {
        return "Motorino{" +
                "colore='" + colore + '\'' +
                ", velocita=" + velocita +
                ", tipo='" + tipo + '\'' +
                ", antifurto=" + antifurto +
                '}';
    }
}
