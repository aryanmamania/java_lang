class MyEmployee{
    private int id;
    private String name;

public String getName(){
    return name;
}
public void setName(String n){
    this.name = n;
}
public int getId(){
    return id;
}
public void setId(int i){
    this.id = i;
}
}
public class privatemodifier {
    public static void main(String[] args){
    MyEmployee aryan = new MyEmployee();
    aryan.setName("mamania");
    aryan.setId(56);
    System.out.println(aryan.getName());
    System.out.println(aryan.getId());
    }
}
