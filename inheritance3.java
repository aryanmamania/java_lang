class Base{
    Base(){
        System.out.println("hello i am a constructor");
    }
    public int x;
    public int getX(){
         return x;
    }
    public void setX(int x){
        this.x = x;
    }
}
    class Derived extends Base{
        Derived(){
            System.out.println("hello i am a constructor2");
        }
        public int y;
        public int getY(){
            return y;
        }
        public void setY(int y){
            this.y = y;
        }
}
public class inheritance3{
    public static void main(String[] args){
     Derived hi = new Derived();
     hi.setX(4);
     hi.getX();
     System.out.println(hi.getX());
    }
}
