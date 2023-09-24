public class pyramid1 {
    static void pyramid(int n){
      for (int i=n; i<=1;i--){
        for (int j=i; j<i-1; j--){
         System.out.print("*");
        }
        System.out.println(n);
      }
     
    }
    public static void main(String[]args){
 pyramid(5);

    }
}
