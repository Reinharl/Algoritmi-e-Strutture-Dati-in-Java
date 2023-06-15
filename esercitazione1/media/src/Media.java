public class Media {
    public static void main(String[] args) {
        int[] array = {6, 3, 1, 2, 9};
        double somma = 0;
        double media;

        for (int element : array) {
            somma += element;
        }

        media = somma / array.length;

        System.out.println("La media vale: " + media);
    }
}
