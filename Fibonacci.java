public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10, a = 0, b = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        
        for (int i = 1; i <= n; ++i) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
