import model.*;

public class Main {
    public static void main(String[] args) {
        Dipendente d1 = new Dipendente("NRLUGI01S08H101A", "Luigi", "Neri", 2023, 4000);
        Dipendente d2 = new Dipendente("RSSMRO02S04V102B", "Mario", "Rossi", 2023, 3800);
        Dipendente d3 = new Dipendente("BNCRBR03S02C103C", "Roberto", "Bianchi", 2023, 4500);

        System.out.println(d1.guadagnaPiuDi(d2));
        System.out.println(d1.guadagnaPiuDi(d3));
    }
}
