package core.hw.patterns;

public class Factorial {
    public int getFactorial(int n) {
        if (n == 0) return 1;

        return getFactorial(n - 1) * n;
    }
}
