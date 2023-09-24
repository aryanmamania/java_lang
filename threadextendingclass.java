/*  class thread1 extends Thread{
    public void run(){
        while(true){
            System.out.println("hello i am mamania");
        }
    }
}
class thread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("Aryan Mamania");
        }
    }
}
public class threadextendingclass{
    public static void main(String[] args){
        thread1 obj = new thread1();
        thread2 obj1 = new thread2();
        obj.start();
        obj1.start();
    }
} */

class thread1 extends Thread{
    public void run(){
        while(true){
        System.out.println("aryan");
     }
    }
}
class thread2 extends Thread{
    public void run(){
        while(true){
        System.out.println("mamania");
    }
}
}
public class threadextendingclass{
    public static void main(String[] args){
        thread1 obj = new thread1();
        thread2 obj1 = new thread2();

        obj.start();
        obj1.start();
    }
}
