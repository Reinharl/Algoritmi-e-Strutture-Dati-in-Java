import java.util.Arrays;
import java.util.Scanner;

public class SortReport {

    public static void main(String[] args) {

        int[] array = initArray();
        System.out.println(Arrays.toString(array) + "\n");

        long inizio = System.nanoTime();
        int[] sortArray = selectionSort(array);
        long fine = System.nanoTime();
        long time = (fine - inizio) / 1000;

        System.out.println(Arrays.toString(sortArray));
        System.out.println("Tempo: " + time + " microsecondi.\n");

        inizio = System.nanoTime();
        int[] bubbleArray = bubbleSort(array);
        fine = System.nanoTime();
        time = (fine - inizio) / 1000;

        System.out.println(Arrays.toString(bubbleArray));
        System.out.println("Tempo: " + time + " microsecondi.");

    }


    public static int[] initArray() {
        Scanner sc = new Scanner(System.in);

        // <Selection sort> = 5.65 microsecondi // <Bubble sort> = 7.75 microsecondi
        // int[] array = {9, 8, 1, 2, 6, 0, 45, -89, 54, 21, -87, 23, -21, -5, 0, 65, 85, 4, 12, 1};

        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Inserisci il " + (i + 1) + "' numero: ");
            array[i] = sc.nextInt();
        }

        return array;
    }

    public static int[] selectionSort(int[] array) {
        int min;
        int temp;

        for (int i = 0; i < array.length - 1; i++) {
            min = i;

            // Selection
            for (int j = i; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            // Swapping
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }

        return array;
    }

    public static int[] bubbleSort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {

                    // Swapping
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }
        }

        return array;
    }

}
