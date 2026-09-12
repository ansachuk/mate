package core.hw.patterns;

// todo 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...

public class FibonacciSequence {
    public int getFibonacciNumber(int n) {
        if (n == 0) {
            return 0;
        }

        if (n <= 2) {
            return 1;
        }

        return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
    }
}
