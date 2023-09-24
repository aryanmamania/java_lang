class Animal{
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
      this.x= x;
    }
}
    class cat extends Animal{
        int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y= y;
    }
    }

public class inheritance2 {
    public static void main(String [] args){
        cat b= new cat();
        b.setX(45);
        b.getX();
        System.out.println(b.getX());

    }
}
