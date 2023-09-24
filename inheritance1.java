class Circle{
    public void hello(){
    System.out.println("hello world");
    }
}
class Cylinder extends Circle{
    public void aryan(){
        System.out.println("Aryan mamania");
    }
}
 public class inheritance1{
    public static void main( String [] args){
        Cylinder obj = new Cylinder();
        obj.hello();
    }
 }