
public class FibonacciNumber {
//Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

    public static void main(String[] args) {
        int n1 = 1, n2 = 1, n3, i, count = 20;
        System.out.print(n1 + " " + n2);
        for (i = 1; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}