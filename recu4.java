public class recu4 {
    public static void main(String[]args){
        int result = factorial(5); 
        System.out.println("Factorial of 5 is: " + result);
    }
    static int factorial(int n){
        if(n<=2){
            return 1;
        }
        return n * factorial(n - 1);


    }
}
