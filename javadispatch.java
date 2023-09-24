class phone{
    public void greet(){
      System.out.println("hello phone");
    }
    public void aryan(){
        System.out.println("hello aryan's phone");
    }
}
class smartphone extends phone{
    public void button(){
        System.out.println("my head will die");
    }
    public void aryan(){
        System.out.println("Redmi note 5 pro aka yuno");
    }
}
public class javadispatch{
    public static void main(String[] args){
        phone obj = new smartphone();
        obj.aryan();
    }
}

// also known as runtime polymorphism
