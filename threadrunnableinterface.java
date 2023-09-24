/*  class mythread1 implements Runnable{
    public void run(){
    while(true){   
            System.out.println("My name is aryan");
    }
}
}
class mythread2 implements Runnable{
    public void run(){
    while(true){
        System.out.println("Mamania");
    }
}
}
public class threadrunnableinterface{
    public static void main(String[] args){
        mythread1 obj = new mythread1();
        Thread name1 = new Thread(obj);
        mythread2 obj1 = new mythread2();
        Thread name2 = new Thread(obj1);

        name1.start();
        name2.start();
    }
} */
class mythread1 implements Runnable{
    public void run(){
        while(true){
            System.out.println("aryan");
        }
    }
}
class mythread2 implements Runnable{
    public void run(){
        while(true){
            System.out.println("mamania");
        }
    }
}
public class threadrunnableinterface{
    public static void main (String[] args){
        mythread1 obj = new mythread1();
        Thread gun = new Thread(obj);
        mythread2 obj1 = new mythread2();
        Thread gun2 = new Thread(obj1);
        gun.start();
        gun2.start();
    }
}