package model;

public class TipoCapoAbbigliamento {
    private String marca;
    private String modello;
    private double costo;

    public TipoCapoAbbigliamento(String marca, String modello, double costo) {
        this.marca = marca;
        this.modello = modello;
        this.costo = costo;
    }

    public TipoCapoAbbigliamento() {
    }

    public void getCosto() {
        System.out.println("Costo: " + costo);
    }

    public double applicaSconto(double sconto) {
        return costo -= costo * sconto / 100;
    }

    public void modificaCosto(double costo) {
        this.costo = costo;
    }
}
