class Employee{
    int salary;
    String name;
public int getSalary(){
    return salary;
}
public String getName(){
    return name;
}
public void setname(String n){
  name = n;
}
}
public class classquestion {
  
    public static void main(String[] args){
      
        Employee aryan = new Employee();
        aryan.setname("AryanMamania");
        System.out.println(aryan.getName());
        aryan.salary=56;
        System.out.println(aryan.getSalary());
    }
}
