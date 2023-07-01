import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {7, -2, 5, 0, 12, -4, 3, 5, 1, -1};
        System.out.println(Arrays.toString(heapSort(array)));
    }

    /**
     * Ordinamento per selezione del contenuto dell'array O(n^2).
     *
     * @param array l'array da ordinare
     * @return l'array ordinato
     */
    public static int[] selectionSort(int[] array) {
        int temp, min;

        for (int i = 0; i < array.length; i++) {
            min = i;

            // selection
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            // swapping
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        return array;
    }

    /**
     * Ordinamento a bolle del contenuto dell'array O(n^2).
     *
     * @param array l'array da ordinare
     * @return l'array ordinato
     */
    public static int[] bubbleSort(int[] array) {
        int temp;

        for (int i = 0; i < array.length; i++) {

            // bubble & swapping
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

    /**
     * Ordinamento per inserimento del contenuto dell'array O(n^2).
     *
     * @param array l'array da ordinare
     * @return l'array ordinato
     */
    public static int[] insertionSort(int[] array) {
        int j;

        for (int i = 1; i < array.length; i++) {

            int key = array[i];
            j = i - 1;

            // insertion
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;

        }

        return array;

    }

    /**
     * Ordinamento per fusione del contenuto dell'array O(n*log(n)).
     *
     * @param array l'array da ordinare
     * @return l'array ordinato
     */
    public static int[] mergeSort(int[] array) {
        if (array.length < 2) {
            return array; // Caso base
        }

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }

        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }

        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right, array);

    }

    public static int[] merge(int[] left, int[] right, int[] array) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }

        return array;
    }

    /**
     * Ordinamento basato sul principio di "divide et impera" O(n*log(n)).
     *
     * @param array l'array da ordinare
     * @return l'array ordinato
     */
    public static int[] quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);

            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    /**
     * Ordinamento basato su heap O(n*log(n)).
     *
     * @param array l'array da ordinare
     * @return l'array ordinato
     */
    public static int[] heapSort(int[] array) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }

        return array;
    }

    public static void heapify(int[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            heapify(array, n, largest);
        }
    }

}
