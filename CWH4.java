import java.util.Scanner;

import java.util.Scanner;
public class CWH4 {

    public static void main(String[]args){
        int a, b, c;
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter your marks in English");
        a = sc.nextInt();
        System.out.println("Enter your marks in phsyics");
        b = sc.nextInt();
        System.out.println("Enter your marks in hindi");
        c = sc.nextInt();
        float avg = a+b+c/300*100;
        if (avg>40 &&a>40 &&b>40 &&c>40){
            System.out.println("The student passed his exam");
        }
        else {
            System.out.println("The student failed his exam");
        }
    }
}
