public class recu6 {
   public static void main (String[] args){
    int ans= product(54);
    System.out.println(ans);
   } 
   static int product(int n){
    if(n<10 ){
        return n;
    }
    return (n%10) * product(n/10);
   }
}
