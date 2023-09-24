class Base{
    Base(){
        System.out.println("hellooooooooooo");
    }
    Base(int a){
        System.out.println("my name is aryan "+ a + " belive it ");
    }
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x= x;
    }
}
class Derived extends Base{
 Derived(){
    super(02); 
    System.out.println("i am hungry");
  }
}
public class inheritance4 {
    public static void main(String[] args){
        Derived obj = new Derived();
        obj.setX(30);
        obj.getX();
        System.out.println(obj.getX());
    }
}
