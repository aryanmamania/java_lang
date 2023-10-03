public class recu3 {
    public static void main (String[]args){
        funct(5);
    }
    static void funct(int n){
 if(n==0){
    return;
 }
 System.out.println(n);
 funct(n-1);
 System.out.println(n);
    }
}
