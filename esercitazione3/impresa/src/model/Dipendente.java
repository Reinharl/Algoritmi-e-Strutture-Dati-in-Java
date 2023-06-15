package model;

public class Dipendente extends Persona {
    private int annoAssunzione;
    private double stipendio;

    public Dipendente(String codiceFiscale, String nome, String cognome, int annoAssunzione, double stipendio) {
        super(codiceFiscale, nome, cognome);
        this.annoAssunzione = annoAssunzione;
        this.stipendio = stipendio;
    }

    public Dipendente() {
    }

    public int getAnnoAssunzione() {
        return annoAssunzione;
    }

    public void setAnnoAssunzione(int annoAssunzione) {
        this.annoAssunzione = annoAssunzione;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "annoAssunzione=" + annoAssunzione +
                ", stipendio=" + stipendio +
                "} " + super.toString();
    }

    public boolean guadagnaPiuDi(Dipendente dipendente) {
        if (this.stipendio > dipendente.getStipendio())
            return true;
        else
            return false;
    }
}
