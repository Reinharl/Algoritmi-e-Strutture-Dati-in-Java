public class Main {
    public static void main(String[] args) {
        Stack<Integer> S = new ArrayStack<>();

        S.push(5);
        S.push(3);
        System.out.println(S.size());
        System.out.println(S.pop());
        System.out.println(S.isEmpty());
    }
}
