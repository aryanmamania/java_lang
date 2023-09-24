public class methods1 {
    int logic(int x, int y){
        int f;
        if (x>y){
            f= x+y;
        }
        else{
            f=x-y;
        }
        return f;
    }
    public static void main(String[] args){
     methods1 obj = new methods1();
     int a=4;
     int b=1;
     int c;
     c= obj.logic(a,b);
     System.out.println(c);
    }
}
