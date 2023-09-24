import java.util.Scanner;

public class caseswitch {
 public static void main (String[]args){
    int age;
    System.out.println("Enter YOur age");
    Scanner sc= new Scanner(System.in);
    age = sc.nextInt();
    switch (age) {
        case 1:
            System.out.println("You are a cute little baby");
            break;
        case 18:
        System.out.println("You are becoming an adult");
            break;
        case 20:
        System.out.println("Congo you are already an adult");
            break;
        default:
        System.out.println("Your age not identifed");
            break;
    }
    System.out.println("ty for using my code");
 }    
    
}
