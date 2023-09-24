class Base{
    int x;
    // public int getX(){
    //     return x;
    // }
    // public void setX(int x){
    //     System.out.println("hiii i am aryan");
    // }
    public void printme(){
        System.out.println("i am a constructor");
    }
}
class Derived extends Base{ 
 int y;
// public int getY(){
//     return y;
// }
// public void setY(int y){
//     this.y = y;
// }
}
public class inheritance {
    public static void main (String[] args){
        Base ob = new Base();
        ob.x = 12;
        System.out.println(ob.x);
        // Derived b= new Derived();
        // b.setX(4);
        // b.getX();
        // System.out.println(b.getX());
      }
}
