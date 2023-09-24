public class varargs {
    static int sum(int ...arr){
        int result=0;
        for (int a:arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[]args){
        System.out.println("the sum of 5 and 10 is " +sum(4,8,8 ));
        System.out.println("the sum of 5 numbers is " +sum(5,8,5,3,7));

    }
}
