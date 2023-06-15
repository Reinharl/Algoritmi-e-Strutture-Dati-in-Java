public class InvertiArray {
    public static void main(String[] args) {

        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverseArray(data, 0, 9);

        for (int el : data)
            System.out.print(el + ", ");
    }

    public static void reverseArray(int data[], int low, int high) {
        if (low < high) {
            int temp = data[low];
            data[low] = data[high];
            data[high] = temp;
            reverseArray(data, low + 1, high - 1);
        }
    }

}
