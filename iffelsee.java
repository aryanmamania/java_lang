import java.util.Scanner;

public class iffelsee {
    public static void main (String[]args){
      int age;
      System.out.println("Enter your age");
      try (Scanner sc = new Scanner(System.in)) {
        age = sc.nextInt();
      }
      if (age>18){
      System.out.println("you are an adult");
    }
    else if(age>30){
      System.out.println("YOu are old");
    }
    else if(age>50){
      System.out.println("You aremabout to die");
    }
    else {
      System.out.println("You are a dead person");
    }
  }
}
