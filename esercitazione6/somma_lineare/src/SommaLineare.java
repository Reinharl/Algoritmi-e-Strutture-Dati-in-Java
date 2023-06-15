import java.util.Scanner;

public class SommaLineare {
    public static void main(String[] args) {

        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner input = new Scanner(System.in);

        System.out.print("Quanti numeri devo sommare? ");
        int n = input.nextInt();
        System.out.println("La somma è = " + linearSum(data, n));
    }

    public static int linearSum(int[] data, int n) {
        if (n == 0)
            return 0;
        else
            return linearSum(data, n - 1) + data[n - 1];
    }
}
