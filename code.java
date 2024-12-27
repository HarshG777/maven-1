import java.util.Scanner;

public class FibonacciIterative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers you want: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            System.out.println("Fibonacci sequence:");
            for (int num : fibonacciIterative(n)) {
                System.out.print(num + " ");
            }
        }
    }

    public static int[] fibonacciIterative(int n) {
        int[] fibSequence = new int[n];
        if (n >= 1) fibSequence[0] = 0;
        if (n >= 2) fibSequence[1] = 1;

        for (int i = 2; i < n; i++) {
            fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
        }
        return fibSequence;
    }
}
