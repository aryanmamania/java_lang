public class recu2 {
    public static void main (String[] args){
        funct(1);
    }
  static void funct(int n){
        if(n==6){
        return;
        }
        System.out.println(n);
        funct(n+1);
    }
}
