class Employee1{
    int id;
    String name;
    public void aryan(){
        System.out.println("this is my salary " +id);
    }
   }
   
public class creatingclass {
    public static void main(String[]args){
        System.out.println("this is awesome");
    Employee1 mamania = new Employee1();
    Employee1 kumar = new Employee1();
    mamania.id= 15;
    mamania.name = "aryan mamania";
    kumar.id=20;
    System.out.println(mamania.id);
    System.out.println(mamania.name);
    mamania.aryan();
    kumar.aryan();
    }
}
