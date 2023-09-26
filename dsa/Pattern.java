package dsa;

public class Pattern {
    
    public static void main(String[] args) {
        myPattern(4); // Corrected method name here
    }

    static void myPattern(int n) { // Corrected method name here
        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col <= rows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

