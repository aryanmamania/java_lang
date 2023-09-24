public class practiceset7 {
  public static void main(String[] args){
 int []marks = {5 , 7 ,8, 3 ,7};
  int num=80;
  boolean IsInArray = false;
  for(int element:marks){
     if(num==element){
        IsInArray = true;
        break;
     }
  }
  if(IsInArray){
    System.out.println("The value is present in Array");
  }
  else{
    System.out.println("the value is not present in array");
  }
  }  
}
