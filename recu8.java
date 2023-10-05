public class recu8 {
    public static void main(String[] args) {
        System.out.println(palin(12321));
    }

    static int rev(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n == 0) {
            return 0;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

    static boolean palin(int n) {
        return n == rev(n);
    }
}