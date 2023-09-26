package dsa;

public class Pattern6 {
  
    public static void main( String[] args){
        myPattern(4);
    }
    
    static void myPattern(int n){
        int orignalN= n;
        n = 2*n;
   for (int row=0; row <=n ; row++){
for (int col=0; col<=n; col++){
int ateveryIndex = orignalN - Math.min(Math.min(row,col), Math.min(n-row , n-col));
System.out.print(ateveryIndex+ "");

}
System.out.println();
   }
         }
        }