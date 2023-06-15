import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Inserire un numero: ");
        int n = input.nextInt();
        System.out.println("Fibonacci = " + fibonacci(n)[0]);
    }

    public static int[] fibonacci(int n) {
        if (n <= 1) {
            int[] answer = {n, 0}; //Passo base
            return answer;
        } else {
            int[] temp = fibonacci(n - 1);  // Somma degli n-1 numeri
            int[] answer = {temp[0] + temp[1], temp[0]};
            return answer;
        }
    }
}

