public class recurrrsion {
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args){
        int n=4;
        System.out.println("The factorial of 4 is " + factorial(n) );
    }
}
