class hero {
    private int rollnumber;
    private String name;
    private int age;
  public int getrollnumber(){
         return rollnumber;
  }
  public void setrollnumber(int n){
     this.rollnumber=n;
  }
  public String getname(){
    return name;
  }
  public void setname(String a){
    this.name=a;
  }
  public int getage(){
    return age;
  }
  public void setage(int b){
    this.age = b;
  }
}
  public class privatemodifier1 {
    public static void main(String[] args){
     hero obj = new hero();
     obj.setrollnumber(65);
     obj.setname("aryan");
     obj.setage(67);
     System.out.println(obj.getrollnumber());
     System.out.println(obj.getname());
     System.out.println(obj.getage());
    }
  }

