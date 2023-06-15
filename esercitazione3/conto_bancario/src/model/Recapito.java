package model;

public class Recapito {
    private String telefono;
    private String tipo;
    private String email;

    public Recapito(String telefono, String tipo, String email) {
        this.telefono = telefono;
        this.tipo = tipo;
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Recapito{" +
                "telefono='" + telefono + '\'' +
                ", tipo='" + tipo + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
