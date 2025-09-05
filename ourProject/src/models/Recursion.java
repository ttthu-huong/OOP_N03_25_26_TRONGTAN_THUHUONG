public class Recursion {

    // Giai thừa (factorial) - đệ qui
    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // Fibonacci (đệ qui - không tối ưu nhưng minh hoạ)
    public static long fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Một ví dụ đệ qui khác (tổng 1..n)
    public static int sumToN(int n) {
        if (n <= 0) return 0;
        return n + sumToN(n - 1);
    }
}
