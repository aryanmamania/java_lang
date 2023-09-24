import java.util.Scanner;


public class CWH1 {
    public static void main (String[]args){
        try (Scanner sc = new Scanner (System.in)) {
        System.out.println("Enter your marks in english ");
        Float a = sc.nextFloat();
        System.out.println("Enter your marks in hindi ");
        Float b = sc.nextFloat();
        System.out.println("Enter your marks in maths ");
        Float c = sc.nextFloat();
        System.out.println("Enter your marks in science ");
        Float d = sc.nextFloat();
        System.out.println("Enter your marks in sst ");
        Float e = sc.nextFloat();
        Float marks = a+b+c+d+e;
        System.out.println("Enter the maximum marks of combined subject ");
        Float toatalmarks = sc.nextFloat();
        Float percentage = marks/toatalmarks*100;
        System.out.println("the percentage of student is ");
        System.out.println(percentage);
    }
    }
}
