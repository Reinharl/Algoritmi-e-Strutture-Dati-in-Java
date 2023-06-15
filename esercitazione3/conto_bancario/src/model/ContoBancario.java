package model;

public class ContoBancario {
    private String codiceConto;
    private double bilancio = 0;
    private Persona persona;

    public ContoBancario() {
    }

    public ContoBancario(String codiceConto, Persona persona) {
        this.codiceConto = codiceConto;
        this.persona = persona;
    }

    public String getCodiceConto() {
        return codiceConto;
    }

    public void setCodiceConto(String codiceConto) {
        this.codiceConto = codiceConto;
    }

    public double getBilancio() {
        return bilancio;
    }

    public void setBilancio(double bilancio) {
        this.bilancio = bilancio;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "ContoBancario{" +
                "codiceConto='" + codiceConto + '\'' +
                ", bilancio=" + bilancio +
                ", persona=" + persona +
                '}';
    }

    public void prelievo(double importo) {
        if (bilancio >= importo) {
            bilancio -= importo;
        } else {
            System.err.println("Saldo insufficiente.");
        }
    }

    public void versamento(double importo) {
        bilancio += importo;
    }

}
