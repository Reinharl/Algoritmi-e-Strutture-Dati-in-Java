import java.util.Deque;
import java.util.LinkedList;

public class PilaOrdinata {
    public static void main(String[] args) {
        Deque<Integer> stack = new LinkedList<>();

        stack.push(1);
        stack.push(5);
        stack.push(9);
        stack.push(2);
        stack.push(4);

        Deque<Integer> sortStack = ordinamentoPila(new LinkedList<>(stack));

        System.out.print("Pila originale: [");
        for (int i = 0; stack.size() > 1; i++) {
            System.out.print(stack.pop() + ", ");
        }
        System.out.println(stack.pop() + "]");

        System.out.print("Pila ordinata: [");
        for (int i = 0; sortStack.size() > 1; i++) {
            System.out.print(sortStack.pop() + ", ");
        }
        System.out.println(sortStack.pop() + "]");

    }

    public static Deque<Integer> ordinamentoPila(Deque<Integer> stack) {
        int[] support = new int[stack.size()];

        for (int i = 0; stack.size() > 0; i++) {
            support[i] = stack.pop();
        }

        for (int i = 0; i < support.length; i++) {
            int max = i;

            // Selection
            for (int j = i + 1; j < support.length; j++) {
                if (support[max] < support[j]) {
                    max = j;
                }
            }

            // Swapping
            stack.push(support[max]);
            support[max] = support[i];

        }

        return stack;
    }
}
