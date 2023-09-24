class A{
    public int a;
    public int harry(){
         
         return 4;
    }
    public void meth2(){
        System.out.println("hello world class A");
    }
    
}
class B extends A{
    public void meth2(){
        System.out.println("Hello");
    }
}
public class methodoverriding{
    public static void main (String[] args){
        B hello = new B();
        hello.meth2(); 

        A aryan = new A();
        aryan.a=10;
        System.out.println(aryan.harry());
        System.out.println(aryan.a);
    }
}