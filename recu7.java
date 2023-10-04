public class recu7 {
    static int ans = 0;

    static void reverse(int n) {
        if (n < 10) {
            ans = ans * 10 + n; 
            return;
        }
        int rem = n % 10;
        ans = ans * 10 + rem;
        reverse(n / 10);
    }

    public static void main(String[] args) {
        reverse(123);
        System.out.println(ans);
    }
}
