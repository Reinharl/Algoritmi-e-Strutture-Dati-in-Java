public class Main {

    public static void main(String[] args) {
        Queue<Integer> Q = new ArrayQueue<>();

        Q.enqueue(5);
        Q.enqueue(3);
        System.out.println(Q.size());
        System.out.println(Q.dequeue());
        System.out.println(Q.isEmpty());
    }

}
