import java.util.Random;
import java.util.Scanner;

public class project1 {

  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in); 
  Random ra= new Random();
  int i,userwin=0,compwin=0;
  System.out.println("Welcome to my game of rock , paper and scisors . This game will be played in 5 sets");
  System.out.println("Enter you name");
  String username=sc.nextLine(); 
  for ( i=1;i<=5;i++){ 
  System.out.println("SET"+i );
  System.out.println(" Its time for you to choose! \n \t 0 for Rock \n\t 1 for scissors\n\t 2 for paper");
 
  int userinput=sc.nextInt(); 
  switch (userinput){ 
    case 0:
    System.out.println(" You have chosen Rock");
    break; 
    case 1:
    System.out.println(" You have chosen Scissors"); 
    break; 
    case 2:
    System.out.println(" You have chosen Paper"); 
    break; 
    default:
    System.out.println(" Please try next time"); 
  }
 
  System.out.println(" Its time for computer input"); 
  int compinput= ra.nextInt(3); 
  switch(compinput){ 
    case 0:
    System.out.println("Computer has chosen Rock"); 
    break;
    case 1:
    System.out.println("Computer has chosen Scissors");
    break;
    case 2:
    System.out.println("Computer has chosen Paper");
    break;
    default:
    System.out.println("Try next time the AI is down"); 
  }
  if(userinput==compinput) 
  System.out.println("Match tie"); 
  else{ 
  if(userinput==0 && compinput==1){ 
  System.out.println(username+ " win"); 
  userwin++;} 
  else if(userinput==0 && compinput==2){ 
  System.out.println(username+ " loose"); 
  compwin++;} 
  else if(userinput==1 && compinput==0){ 
  System.out.println(username+ " loose"); 
  compwin++;} 
  else if(userinput==1 && compinput==2){ 
  System.out.println(username+ " win"); 
  userwin++;} 
  else if(userinput==2 && compinput==0){ 
  System.out.println(username+ " win"); 
  userwin++;} 
  else if(userinput==2 && compinput==1){ 
  System.out.println(username+ " loose"); 
  compwin++;} 
  else  
  System.out.println("Try next time the AI is down"); 
  } 
  } 
  if(userwin>compwin) 
  System.out.println( 
	  username+  " wins, Congratulations!");  
  else if (userwin==compwin) 
  System.out.println(
	 " Match tie, Well played!"); 
  else  
  System.out.println(
	  username+ " loose, Try harder!"); 
  }
}

