public class FibonacciGenerator {

    public static void generateFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        long first = 0;
        long second = 1;

        System.out.print("First " + n + " Fibonacci numbers: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        generateFibonacci(100);
    }
}
