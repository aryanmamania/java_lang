package dsa;

public class Pattern3 {
        public static void main(String[] args) {
            myPattern(4); 
        }

     static void myPattern(int n) {
        for (int row = 1; row <= n; row++) {
        
            for (int col = 1; col <=row; col++) {
                System.out.print(col);
            }

            System.out.println();
     }
            
}}

