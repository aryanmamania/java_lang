public class varargs1 {
    static void multiply(int i){
       for (int n=1;n<=10;n++){
       System.out.format("%d X %d = %d \n",n,i,n*i);
       }
       }
       public static void main(String[]args){
        int n=7;
        System.out.format("Table of %d is \n",n);
        multiply(7);
       }
    }
