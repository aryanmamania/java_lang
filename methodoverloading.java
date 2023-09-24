public class methodoverloading {
    static void foo(){
        System.out.println("one piece");
    }
    static void foo(int a){
        System.out.println("One piece has " + a + " episodes");
    }
    static void foo(int b, int c){
        System.out.println("There are total of " + b + " yonko and " + c + " pirates");
    }
    public static void main(String[] args){
        foo();
        foo(1000);
        foo(4 , 10000);
    }
}

