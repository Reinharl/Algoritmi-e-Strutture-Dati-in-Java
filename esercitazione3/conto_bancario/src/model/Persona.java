package model;

public class Persona {
    private String cognome;
    private String nome;
    private int eta;
    private String codiceFiscale;
    private Indirizzo indirizzo;
    private Recapito recapito;

    public Persona() {
    }

    public Persona(String cognome, String nome, int eta, String codiceFiscale, Indirizzo indirizzo, Recapito recapito) {
        this.cognome = cognome;
        this.nome = nome;
        this.eta = eta;
        this.indirizzo = indirizzo;
        this.recapito = recapito;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public Indirizzo getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(Indirizzo indirizzo) {
        this.indirizzo = indirizzo;
    }

    public Recapito getRecapito() {
        return recapito;
    }

    public void setRecapito(Recapito recapito) {
        this.recapito = recapito;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "cognome='" + cognome + '\'' +
                ", nome='" + nome + '\'' +
                ", eta='" + eta + '\'' +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                ", indirizzo=" + indirizzo +
                ", recapito=" + recapito +
                '}';
    }

}
