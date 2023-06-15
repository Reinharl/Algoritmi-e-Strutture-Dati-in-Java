public class PariDispari {
    public static void main(String[] args) {
        int[] array = {6, 3, 1, 2, 9};
        int numeriPari = 0;
        int numeriDispari = 0;

        for (int element : array) {
            if (element % 2 == 0)
                numeriPari++;
            else
                numeriDispari++;
        }

        System.out.println("Ci sono " + numeriPari + " numeri pari e " + numeriDispari + " numeri dispari.");
    }
}
