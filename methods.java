public class methods {
    static int logic(int x , int y){
        int z;
        if (x>y){
            z= x+y;
        }
        else{
            z= x-y;
        }
        return z;
    }
    public static void main(String[] args){
        int a=6;
        int b=4;
        int c;
        c = logic(a,b);
        int e=1;
        int f=5;
        int d;
        d= logic(e,f);
        System.out.println(c);
        System.out.println(d);
    }
}
